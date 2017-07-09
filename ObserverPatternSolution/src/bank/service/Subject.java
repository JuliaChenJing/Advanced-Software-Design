package bank.service;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

import bank.domain.Account;




public class Subject implements ISubject {
  private Collection<IObserver> observerlist = new ArrayList();
  
  public void addObserver(IObserver observer){
	  observerlist.add(observer);
  }
  
  public void donotify(Account account){
	  Iterator<IObserver> iterator = observerlist.iterator();
	  while(iterator.hasNext()){
		  IObserver observer = iterator.next();
		  observer.update(account);
	  }
  }
  
}
