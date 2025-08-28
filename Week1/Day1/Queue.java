import java.util.PriorityQueue;

class Customer {
    String name;
    int priority; 

    Customer(String name, int priority) {
        this.name = name;
        this.priority = priority;
    }

    public String toString() {
        return name + " (Priority: " + priority + ")";
    }
}

class CallCenterQueue {
    PriorityQueue<Customer> queue;

    CallCenterQueue() {
        queue = new PriorityQueue<>((c1, c2) -> c2.priority - c1.priority);
    }

    void waiting(Customer customer) {
        queue.add(customer);
    }
    void delete() {
        if (!queue.isEmpty()) {
            Customer served = queue.poll();
            System.out.println("Serving: " + served);
        } else {
            System.out.println("No customers in queue.");
        }
    }

    void display() {
        System.out.println("Current Queue: " + queue);
    }
}
