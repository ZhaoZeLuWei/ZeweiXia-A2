interface RideInterface {
    void addVisitorToQueue(Visitor visitor);
    void removeVisitorFromQueue(Visitor visitor);
    void printQueue();
    void runOneCycle(Employee e);
    void addVisitorToHistory();
    void checkVisitorFromHistory(Visitor checkVisitor);
    void numberOfVisitors();
    void printRideHistory();
}
