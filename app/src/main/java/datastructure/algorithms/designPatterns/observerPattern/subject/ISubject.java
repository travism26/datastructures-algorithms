package datastructure.algorithms.designPatterns.observerPattern.subject;

import datastructure.algorithms.designPatterns.observerPattern.observers.IObserver;

public interface ISubject {
    public void registerObserver(IObserver o);
    public void removeObserver(IObserver o);
    public void notifyObservers();
}
