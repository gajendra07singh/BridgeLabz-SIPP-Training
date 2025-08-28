START

interface Searchable
   method search(keyword)


interface Printable
   method print()

class MedicalRecord
   Attribute recordId
   Attribute patientName
   Attribute date

   constructor(recordId, patientName, date)
      this.recordId = recordId
      this.patientName = patientName
      this.date = date

   method display()
      print recordId, patientName, date

class LabReport extends MedicalRecord implements Searchable, Printable
   Attribute testType
   Attribute result

   constructor(recordId, patientName, date, testType, result)
      super(recordId, patientName, date)
      this.testType = testType
      this.result = result

   method search(keyword)
      if (testType contains keyword OR result contains keyword)
         return true
      else
         return false

   method print()
      print "Lab Report:"
      super.display()
      print testType, result

class Prescription extends MedicalRecord implements Searchable, Printable
   Attribute medicines

   constructor(recordId, patientName, date, medicines)
      super(recordId, patientName, date)
      this.medicines = medicines

   method search(keyword)
      if (medicines contains keyword)
         return true
      else
         return false

   method print()
      print "Prescription:"
      super.display()
      print medicines

class DischargeSummary extends MedicalRecord implements Searchable, Printable
   Attribute diagnosis
   Attribute instructions

   constructor(recordId, patientName, date, diagnosis, instructions)
      super(recordId, patientName, date)
      this.diagnosis = diagnosis
      this.instructions = instructions

   method search(keyword)
      if (diagnosis contains keyword OR instructions contains keyword)
         return true
      else
         return false

   method print()
      print "Discharge Summary:"
      super.display()
      print diagnosis, instructions

class MedicalRecordManager
   Attribute records (List<MedicalRecord>)

   constructor()
      create empty list records

   method addRecord(record)
      add record to records

   method searchRecords(keyword)
      for each record in records
         if record implements Searchable
            if record.search(keyword) == true
               record.print()

   method printAll()
      for each record in records
         if record implements Printable
            record.print()

END
