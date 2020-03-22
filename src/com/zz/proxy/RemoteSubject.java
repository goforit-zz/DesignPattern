package com.zz.proxy;

import java.rmi.Remote;
import java.rmi.RemoteException;

/**
 * @author zz
 * @date 2019/12/2 21:44
 */
public interface RemoteSubject extends Remote {
    double getArea() throws RemoteException;
}
