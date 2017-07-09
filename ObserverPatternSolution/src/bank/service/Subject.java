package bank.service;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

import bank.domain.Account;


public class Subject implements ISubject {
  private Collection<IObserver> observerlist ;
  
  public Subject (){
	  observerlist = new ArrayList();
  }
  
  public void addObserver(IObserver observer){
	  observerlist.add(observer);
  }
  
  public void notify(Account account){
	  Iterator<IObserver> iterator = observerlist.iterator();
	  while(iterator.hasNext()){
		  IObserver observer = iterator.next();
		  //notify each and every observer in the list
		  observer.update(account);
	  }
  }
  
}
