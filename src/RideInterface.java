interface RideInterface {
    void addVisitorToQueue(Visitor visitor);
    void removeVisitorFromQueue();
    void printQueue();
    void runOneCycle();
    void addVisitorToHistory(Visitor visitor);
    void checkVisitorFromHistory(Visitor checkVisitor);
    void numberOfVisitors();
    void printRideHistory();
}
