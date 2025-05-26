package com.appsflyer.internal;

import com.appsflyer.AFLogger;
import java.io.InterruptedIOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.NavigableSet;
import java.util.Set;
import java.util.Timer;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentSkipListSet;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.CopyOnWriteArraySet;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class AFf1uSDK {
    final ExecutorService AFAdRevenueData;
    final Set<AFf1rSDK> areAllFieldsValid;
    final List<AFe1aSDK<?>> component1;
    final NavigableSet<AFe1aSDK<?>> component2;
    final Set<AFe1aSDK<?>> component3;
    final NavigableSet<AFe1aSDK<?>> component4;
    public Executor getCurrencyIso4217Code;
    final Timer getMediationNetwork;
    public final List<AFf1ySDK> getMonetizationNetwork;
    final Set<AFf1rSDK> getRevenue;

    /* renamed from: com.appsflyer.internal.AFf1uSDK$3, reason: invalid class name */
    public class AnonymousClass3 implements Runnable {
        private /* synthetic */ AFe1aSDK getMonetizationNetwork;

        public AnonymousClass3(AFe1aSDK aFe1aSDK) {
            this.getMonetizationNetwork = aFe1aSDK;
        }

        @Override // java.lang.Runnable
        public final void run() {
            boolean add;
            synchronized (AFf1uSDK.this.component2) {
                try {
                    if (AFf1uSDK.this.component3.contains(this.getMonetizationNetwork)) {
                        AFLogger aFLogger = AFLogger.INSTANCE;
                        AFh1sSDK aFh1sSDK = AFh1sSDK.QUEUE;
                        StringBuilder sb3 = new StringBuilder("tried to add already running task: ");
                        sb3.append(this.getMonetizationNetwork);
                        aFLogger.d(aFh1sSDK, sb3.toString());
                        return;
                    }
                    if (!AFf1uSDK.this.component2.contains(this.getMonetizationNetwork) && !AFf1uSDK.this.component4.contains(this.getMonetizationNetwork)) {
                        AFf1uSDK aFf1uSDK = AFf1uSDK.this;
                        AFe1aSDK aFe1aSDK = this.getMonetizationNetwork;
                        for (AFf1rSDK aFf1rSDK : aFe1aSDK.getMediationNetwork) {
                            if (aFf1uSDK.areAllFieldsValid.contains(aFf1rSDK)) {
                                aFe1aSDK.getMonetizationNetwork.add(aFf1rSDK);
                            }
                        }
                        if (AFf1uSDK.this.getRevenue(this.getMonetizationNetwork)) {
                            add = AFf1uSDK.this.component2.add(this.getMonetizationNetwork);
                        } else {
                            add = AFf1uSDK.this.component4.add(this.getMonetizationNetwork);
                            if (add) {
                                AFLogger aFLogger2 = AFLogger.INSTANCE;
                                AFh1sSDK aFh1sSDK2 = AFh1sSDK.QUEUE;
                                StringBuilder sb4 = new StringBuilder("new task was blocked: ");
                                sb4.append(this.getMonetizationNetwork);
                                aFLogger2.d(aFh1sSDK2, sb4.toString());
                                this.getMonetizationNetwork.AFAdRevenueData();
                            }
                        }
                        if (add) {
                            AFf1uSDK aFf1uSDK2 = AFf1uSDK.this;
                            aFf1uSDK2.component2.addAll(aFf1uSDK2.component1);
                            AFf1uSDK.this.component1.clear();
                        } else {
                            AFLogger aFLogger3 = AFLogger.INSTANCE;
                            AFh1sSDK aFh1sSDK3 = AFh1sSDK.QUEUE;
                            StringBuilder sb5 = new StringBuilder("task not added, it's already in the queue: ");
                            sb5.append(this.getMonetizationNetwork);
                            aFLogger3.d(aFh1sSDK3, sb5.toString());
                        }
                        if (!add) {
                            AFLogger aFLogger4 = AFLogger.INSTANCE;
                            AFh1sSDK aFh1sSDK4 = AFh1sSDK.QUEUE;
                            StringBuilder sb6 = new StringBuilder("QUEUE: tried to add already pending task: ");
                            sb6.append(this.getMonetizationNetwork);
                            aFLogger4.w(aFh1sSDK4, sb6.toString());
                            return;
                        }
                        AFf1uSDK.this.areAllFieldsValid.add(this.getMonetizationNetwork.getRevenue);
                        AFLogger aFLogger5 = AFLogger.INSTANCE;
                        AFh1sSDK aFh1sSDK5 = AFh1sSDK.QUEUE;
                        StringBuilder sb7 = new StringBuilder("new task added: ");
                        sb7.append(this.getMonetizationNetwork);
                        aFLogger5.d(aFh1sSDK5, sb7.toString());
                        for (AFf1ySDK aFf1ySDK : AFf1uSDK.this.getMonetizationNetwork) {
                        }
                        AFf1uSDK aFf1uSDK3 = AFf1uSDK.this;
                        aFf1uSDK3.AFAdRevenueData.submit(aFf1uSDK3.new AnonymousClass5());
                        AFf1uSDK aFf1uSDK4 = AFf1uSDK.this;
                        synchronized (aFf1uSDK4.component2) {
                            try {
                                for (int size = (aFf1uSDK4.component2.size() + aFf1uSDK4.component4.size()) - 40; size > 0; size--) {
                                    boolean z13 = !aFf1uSDK4.component4.isEmpty();
                                    boolean z14 = !aFf1uSDK4.component2.isEmpty();
                                    if (z14 && z13) {
                                        if (aFf1uSDK4.component2.first().compareTo(aFf1uSDK4.component4.first()) > 0) {
                                            aFf1uSDK4.getRevenue(aFf1uSDK4.component2);
                                        } else {
                                            aFf1uSDK4.getRevenue(aFf1uSDK4.component4);
                                        }
                                    } else if (z14) {
                                        aFf1uSDK4.getRevenue(aFf1uSDK4.component2);
                                    } else if (z13) {
                                        aFf1uSDK4.getRevenue(aFf1uSDK4.component4);
                                    }
                                }
                            } catch (Throwable th3) {
                                throw th3;
                            }
                        }
                        return;
                    }
                    AFLogger aFLogger6 = AFLogger.INSTANCE;
                    AFh1sSDK aFh1sSDK6 = AFh1sSDK.QUEUE;
                    StringBuilder sb8 = new StringBuilder("tried to add already scheduled task: ");
                    sb8.append(this.getMonetizationNetwork);
                    aFLogger6.d(aFh1sSDK6, sb8.toString());
                } catch (Throwable th4) {
                    throw th4;
                }
            }
        }
    }

    /* renamed from: com.appsflyer.internal.AFf1uSDK$5, reason: invalid class name */
    public class AnonymousClass5 implements Runnable {
        public AnonymousClass5() {
        }

        @Override // java.lang.Runnable
        public final void run() {
            synchronized (AFf1uSDK.this.component2) {
                try {
                    final AFe1aSDK<?> pollFirst = AFf1uSDK.this.component2.pollFirst();
                    if (pollFirst == null) {
                        return;
                    }
                    AFf1uSDK.this.component3.add(pollFirst);
                    long monetizationNetwork = pollFirst.getMonetizationNetwork();
                    AFf1sSDK aFf1sSDK = new AFf1sSDK(Thread.currentThread());
                    if (monetizationNetwork > 0) {
                        AFf1uSDK.this.getMediationNetwork.schedule(aFf1sSDK, monetizationNetwork);
                    }
                    final AFf1uSDK aFf1uSDK = AFf1uSDK.this;
                    aFf1uSDK.getCurrencyIso4217Code.execute(new Runnable() { // from class: com.appsflyer.internal.AFf1uSDK.2
                        @Override // java.lang.Runnable
                        public final void run() {
                            Iterator<AFf1ySDK> it = AFf1uSDK.this.getMonetizationNetwork.iterator();
                            while (it.hasNext()) {
                                it.next().getMonetizationNetwork(pollFirst);
                            }
                        }
                    });
                    if (!AFf1uSDK.this.component2.isEmpty()) {
                        AFf1uSDK aFf1uSDK2 = AFf1uSDK.this;
                        aFf1uSDK2.AFAdRevenueData.submit(aFf1uSDK2.new AnonymousClass5());
                    }
                    try {
                        AFLogger.INSTANCE.d(AFh1sSDK.QUEUE, "starting task execution: ".concat(String.valueOf(pollFirst)));
                        final AFf1wSDK call = pollFirst.call();
                        aFf1sSDK.cancel();
                        final AFf1uSDK aFf1uSDK3 = AFf1uSDK.this;
                        aFf1uSDK3.getCurrencyIso4217Code.execute(new Runnable() { // from class: com.appsflyer.internal.AFf1uSDK.4
                            @Override // java.lang.Runnable
                            public final void run() {
                                AFLogger aFLogger = AFLogger.INSTANCE;
                                AFh1sSDK aFh1sSDK = AFh1sSDK.QUEUE;
                                StringBuilder sb3 = new StringBuilder("execution finished for ");
                                sb3.append(pollFirst);
                                sb3.append(", result: ");
                                sb3.append(call);
                                aFLogger.d(aFh1sSDK, sb3.toString());
                                AFf1uSDK.this.component3.remove(pollFirst);
                                Iterator<AFf1ySDK> it = AFf1uSDK.this.getMonetizationNetwork.iterator();
                                while (it.hasNext()) {
                                    it.next().AFAdRevenueData(pollFirst, call);
                                }
                                if (call == AFf1wSDK.SUCCESS) {
                                    AFf1uSDK.this.getRevenue.add(pollFirst.getRevenue);
                                    AFf1uSDK.this.getMonetizationNetwork();
                                    return;
                                }
                                if (!pollFirst.getRevenue()) {
                                    AFf1uSDK.this.getRevenue.add(pollFirst.getRevenue);
                                    AFf1uSDK.this.getMonetizationNetwork();
                                } else if (AFf1uSDK.AFAdRevenueData(pollFirst)) {
                                    synchronized (AFf1uSDK.this.component2) {
                                        try {
                                            AFf1uSDK.this.component1.add(pollFirst);
                                            for (AFf1ySDK aFf1ySDK : AFf1uSDK.this.getMonetizationNetwork) {
                                            }
                                        } catch (Throwable th3) {
                                            throw th3;
                                        }
                                    }
                                }
                            }
                        });
                    } catch (InterruptedIOException | InterruptedException unused) {
                        AFLogger.INSTANCE.d(AFh1sSDK.QUEUE, "task was interrupted: ".concat(String.valueOf(pollFirst)));
                        final AFf1wSDK aFf1wSDK = AFf1wSDK.TIMEOUT;
                        pollFirst.AFAdRevenueData = aFf1wSDK;
                        final AFf1uSDK aFf1uSDK4 = AFf1uSDK.this;
                        aFf1uSDK4.getCurrencyIso4217Code.execute(new Runnable() { // from class: com.appsflyer.internal.AFf1uSDK.4
                            @Override // java.lang.Runnable
                            public final void run() {
                                AFLogger aFLogger = AFLogger.INSTANCE;
                                AFh1sSDK aFh1sSDK = AFh1sSDK.QUEUE;
                                StringBuilder sb3 = new StringBuilder("execution finished for ");
                                sb3.append(pollFirst);
                                sb3.append(", result: ");
                                sb3.append(aFf1wSDK);
                                aFLogger.d(aFh1sSDK, sb3.toString());
                                AFf1uSDK.this.component3.remove(pollFirst);
                                Iterator<AFf1ySDK> it = AFf1uSDK.this.getMonetizationNetwork.iterator();
                                while (it.hasNext()) {
                                    it.next().AFAdRevenueData(pollFirst, aFf1wSDK);
                                }
                                if (aFf1wSDK == AFf1wSDK.SUCCESS) {
                                    AFf1uSDK.this.getRevenue.add(pollFirst.getRevenue);
                                    AFf1uSDK.this.getMonetizationNetwork();
                                    return;
                                }
                                if (!pollFirst.getRevenue()) {
                                    AFf1uSDK.this.getRevenue.add(pollFirst.getRevenue);
                                    AFf1uSDK.this.getMonetizationNetwork();
                                } else if (AFf1uSDK.AFAdRevenueData(pollFirst)) {
                                    synchronized (AFf1uSDK.this.component2) {
                                        try {
                                            AFf1uSDK.this.component1.add(pollFirst);
                                            for (AFf1ySDK aFf1ySDK : AFf1uSDK.this.getMonetizationNetwork) {
                                            }
                                        } catch (Throwable th3) {
                                            throw th3;
                                        }
                                    }
                                }
                            }
                        });
                    } catch (Throwable unused2) {
                        aFf1sSDK.cancel();
                        final AFf1uSDK aFf1uSDK5 = AFf1uSDK.this;
                        final AFf1wSDK aFf1wSDK2 = AFf1wSDK.FAILURE;
                        aFf1uSDK5.getCurrencyIso4217Code.execute(new Runnable() { // from class: com.appsflyer.internal.AFf1uSDK.4
                            @Override // java.lang.Runnable
                            public final void run() {
                                AFLogger aFLogger = AFLogger.INSTANCE;
                                AFh1sSDK aFh1sSDK = AFh1sSDK.QUEUE;
                                StringBuilder sb3 = new StringBuilder("execution finished for ");
                                sb3.append(pollFirst);
                                sb3.append(", result: ");
                                sb3.append(aFf1wSDK2);
                                aFLogger.d(aFh1sSDK, sb3.toString());
                                AFf1uSDK.this.component3.remove(pollFirst);
                                Iterator<AFf1ySDK> it = AFf1uSDK.this.getMonetizationNetwork.iterator();
                                while (it.hasNext()) {
                                    it.next().AFAdRevenueData(pollFirst, aFf1wSDK2);
                                }
                                if (aFf1wSDK2 == AFf1wSDK.SUCCESS) {
                                    AFf1uSDK.this.getRevenue.add(pollFirst.getRevenue);
                                    AFf1uSDK.this.getMonetizationNetwork();
                                    return;
                                }
                                if (!pollFirst.getRevenue()) {
                                    AFf1uSDK.this.getRevenue.add(pollFirst.getRevenue);
                                    AFf1uSDK.this.getMonetizationNetwork();
                                } else if (AFf1uSDK.AFAdRevenueData(pollFirst)) {
                                    synchronized (AFf1uSDK.this.component2) {
                                        try {
                                            AFf1uSDK.this.component1.add(pollFirst);
                                            for (AFf1ySDK aFf1ySDK : AFf1uSDK.this.getMonetizationNetwork) {
                                            }
                                        } catch (Throwable th3) {
                                            throw th3;
                                        }
                                    }
                                }
                            }
                        });
                    }
                } catch (Throwable th3) {
                    throw th3;
                }
            }
        }
    }

    public AFf1uSDK(ExecutorService executorService) {
        ExecutorService newSingleThreadExecutor = Executors.newSingleThreadExecutor();
        Intrinsics.checkNotNullExpressionValue(newSingleThreadExecutor, "");
        this.getCurrencyIso4217Code = newSingleThreadExecutor;
        this.getMediationNetwork = new Timer(true);
        this.getMonetizationNetwork = new CopyOnWriteArrayList();
        this.getRevenue = new CopyOnWriteArraySet();
        this.areAllFieldsValid = Collections.newSetFromMap(new ConcurrentHashMap());
        this.component2 = new ConcurrentSkipListSet();
        this.component4 = new ConcurrentSkipListSet();
        this.component1 = new ArrayList();
        this.component3 = Collections.newSetFromMap(new ConcurrentHashMap());
        this.AFAdRevenueData = executorService;
    }

    public static boolean AFAdRevenueData(AFe1aSDK<?> aFe1aSDK) {
        return ((aFe1aSDK instanceof AFf1bSDK) && aFe1aSDK.getRevenue == AFf1rSDK.ARS_VALIDATE) ? false : true;
    }

    public final void getMonetizationNetwork() {
        synchronized (this.component2) {
            try {
                Iterator<AFe1aSDK<?>> it = this.component4.iterator();
                boolean z13 = false;
                while (it.hasNext()) {
                    AFe1aSDK<?> next = it.next();
                    if (getRevenue(next)) {
                        it.remove();
                        this.component2.add(next);
                        z13 = true;
                    }
                }
                if (z13) {
                    this.AFAdRevenueData.submit(new AnonymousClass5());
                }
            } catch (Throwable th3) {
                throw th3;
            }
        }
    }

    public final void getRevenue(NavigableSet<AFe1aSDK<?>> navigableSet) {
        AFe1aSDK<?> pollFirst = navigableSet.pollFirst();
        this.getRevenue.add(pollFirst.getRevenue);
        Iterator<AFf1ySDK> it = this.getMonetizationNetwork.iterator();
        while (it.hasNext()) {
            it.next().AFAdRevenueData(pollFirst);
        }
    }

    public final boolean getRevenue(AFe1aSDK<?> aFe1aSDK) {
        return this.getRevenue.containsAll(aFe1aSDK.getMonetizationNetwork);
    }
}
