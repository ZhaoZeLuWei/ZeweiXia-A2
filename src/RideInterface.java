interface RideInterface {
    void addVisitorToQueue(Visitor visitor);
    //移除访客可以传入指定对象，因为这取决于访客本身是否需要中途退出队列
    void removeVisitorFromQueue(Visitor visitor);
    void printQueue();

    //必须有工作人员操作才可以运行一次,需要传入一个Employee对象
    void runOneCycle(Employee e);

    //将访客添加到历史记录中，考虑到队列是FIFO（先进先出），所以只能依次执行，不允许有特殊操作
    void addVisitorToHistory();
    //查找访客是否在历史记录中
    boolean checkVisitorFromHistory(Visitor checkVisitor);
    void numberOfVisitors();
    void printRideHistory();
}
