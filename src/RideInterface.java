interface RideInterface {
    void addVisitorToQueue(Visitor visitor);
    void removeVisitorFromQueue();
    void printQueue();
    void runOneCycle();
    void addVisitorToHistory();
    void checkVisitorFromHistory();
    void numberOfVisitors();
    void printRideHistory();
}
