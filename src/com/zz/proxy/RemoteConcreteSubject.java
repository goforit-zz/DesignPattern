package com.zz.proxy;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

/**
 * @author zz
 * @date 2019/12/2 21:58
 */
public class RemoteConcreteSubject extends UnicastRemoteObject implements RemoteSubject {

    double width;
    double length;

    RemoteConcreteSubject(double width, double length) throws RemoteException {
        this.width = width;
        this.length = length;
    }

    @Override
    public double getArea() throws RemoteException {
        return width * length;
    }
}
