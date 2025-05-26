package com.amazonaws.mobileconnectors.s3.transferutility;

import android.content.ContentValues;
import android.os.Handler;
import android.os.Looper;
import com.amazonaws.event.ProgressEvent;
import com.amazonaws.event.ProgressListener;
import com.amazonaws.logging.Log;
import com.amazonaws.logging.LogFactory;
import com.amazonaws.mobileconnectors.s3.transferutility.TransferObserver;
import java.io.File;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArrayList;

/* loaded from: classes3.dex */
class TransferStatusUpdater {

    /* renamed from: c, reason: collision with root package name */
    public static final Log f28695c = LogFactory.a(TransferStatusUpdater.class);

    /* renamed from: d, reason: collision with root package name */
    public static final HashSet f28696d = new HashSet(Arrays.asList(TransferState.PART_COMPLETED, TransferState.PENDING_CANCEL, TransferState.PENDING_PAUSE, TransferState.PENDING_NETWORK_DISCONNECT));

    /* renamed from: e, reason: collision with root package name */
    public static final Map f28697e = new ConcurrentHashMap<Integer, List<TransferListener>>() { // from class: com.amazonaws.mobileconnectors.s3.transferutility.TransferStatusUpdater.1
    };

    /* renamed from: f, reason: collision with root package name */
    public static TransferDBUtil f28698f;

    /* renamed from: g, reason: collision with root package name */
    public static TransferStatusUpdater f28699g;

    /* renamed from: a, reason: collision with root package name */
    public final ConcurrentHashMap f28700a;

    /* renamed from: b, reason: collision with root package name */
    public final Handler f28701b;

    public class TransferProgressListener implements ProgressListener {

        /* renamed from: a, reason: collision with root package name */
        public final TransferRecord f28709a;

        /* renamed from: b, reason: collision with root package name */
        public long f28710b;

        public TransferProgressListener(TransferRecord transferRecord) {
            this.f28709a = transferRecord;
        }

        @Override // com.amazonaws.event.ProgressListener
        public final synchronized void a(ProgressEvent progressEvent) {
            try {
                if (32 == progressEvent.f28581b) {
                    TransferStatusUpdater.f28695c.g("Reset Event triggered. Resetting the bytesCurrent to 0.");
                    this.f28710b = 0L;
                } else {
                    long j13 = this.f28710b + progressEvent.f28580a;
                    this.f28710b = j13;
                    TransferRecord transferRecord = this.f28709a;
                    if (j13 > transferRecord.f28673g) {
                        transferRecord.f28673g = j13;
                        TransferStatusUpdater.this.f(transferRecord.f28667a, j13, transferRecord.f28672f, true);
                    }
                }
            } catch (Throwable th3) {
                throw th3;
            }
        }
    }

    public TransferStatusUpdater(TransferDBUtil transferDBUtil) {
        f28698f = transferDBUtil;
        this.f28701b = new Handler(Looper.getMainLooper());
        this.f28700a = new ConcurrentHashMap();
    }

    public static void b(int i13, TransferListener transferListener) {
        if (transferListener == null) {
            throw new IllegalArgumentException("Listener can't be null");
        }
        Map map = f28697e;
        synchronized (map) {
            try {
                List list = (List) ((ConcurrentHashMap) map).get(Integer.valueOf(i13));
                if (list == null) {
                    CopyOnWriteArrayList copyOnWriteArrayList = new CopyOnWriteArrayList();
                    copyOnWriteArrayList.add(transferListener);
                    ((ConcurrentHashMap) map).put(Integer.valueOf(i13), copyOnWriteArrayList);
                } else if (!list.contains(transferListener)) {
                    list.add(transferListener);
                }
            } catch (Throwable th3) {
                throw th3;
            }
        }
    }

    public static void e(int i13, TransferListener transferListener) {
        if (transferListener == null) {
            throw new IllegalArgumentException("Listener can't be null");
        }
        Map map = f28697e;
        synchronized (map) {
            try {
                List list = (List) ((ConcurrentHashMap) map).get(Integer.valueOf(i13));
                if (list != null && !list.isEmpty()) {
                    list.remove(transferListener);
                }
            } finally {
            }
        }
    }

    public final synchronized ProgressListener a(int i13) {
        TransferRecord transferRecord;
        synchronized (this) {
            transferRecord = (TransferRecord) this.f28700a.get(Integer.valueOf(i13));
        }
        return new TransferProgressListener(transferRecord);
        if (transferRecord != null) {
            f28695c.g("Creating a new progress listener for transfer: " + i13);
            return new TransferProgressListener(transferRecord);
        }
        f28695c.g("TransferStatusUpdater doesn't track the transfer: " + i13);
        throw new IllegalArgumentException("transfer " + i13 + " doesn't exist");
    }

    public final synchronized void c(int i13) {
        try {
            f28698f.getClass();
            TransferRecord f13 = TransferDBUtil.f(i13);
            if (f13 != null) {
                String str = f13.f28679m;
                if (new File(str).getName().startsWith("aws-s3-d861b25a-1edf-11eb-adc1-0242ac120002")) {
                    new File(str).delete();
                }
            }
            S3ClientReference.f28643a.remove(Integer.valueOf(i13));
            f28698f.getClass();
            TransferDBUtil.a(i13);
        } catch (Throwable th3) {
            throw th3;
        }
    }

    public final void d(int i13, Exception exc) {
        Map map = f28697e;
        synchronized (map) {
            try {
                List list = (List) ((ConcurrentHashMap) map).get(Integer.valueOf(i13));
                if (list != null && !list.isEmpty()) {
                    Iterator it = list.iterator();
                    while (it.hasNext()) {
                        this.f28701b.post(new Runnable(i13, exc) { // from class: com.amazonaws.mobileconnectors.s3.transferutility.TransferStatusUpdater.4

                            /* renamed from: b, reason: collision with root package name */
                            public final /* synthetic */ Exception f28708b;

                            {
                                this.f28708b = exc;
                            }

                            @Override // java.lang.Runnable
                            public final void run() {
                                TransferListener.this.c(this.f28708b);
                            }
                        });
                    }
                }
            } finally {
            }
        }
    }

    public final synchronized void f(int i13, long j13, long j14, boolean z13) {
        try {
            TransferRecord transferRecord = (TransferRecord) this.f28700a.get(Integer.valueOf(i13));
            if (transferRecord != null) {
                transferRecord.f28673g = j13;
                transferRecord.f28672f = j14;
            }
            f28698f.getClass();
            ContentValues contentValues = new ContentValues();
            contentValues.put("bytes_current", Long.valueOf(j13));
            TransferDBUtil.f28651c.c(TransferDBUtil.e(i13), contentValues, null, null);
            if (z13) {
                Map map = f28697e;
                synchronized (map) {
                    try {
                        List list = (List) ((ConcurrentHashMap) map).get(Integer.valueOf(i13));
                        if (list != null && !list.isEmpty()) {
                            Iterator it = list.iterator();
                            while (it.hasNext()) {
                                this.f28701b.post(new Runnable(i13, j13, j14) { // from class: com.amazonaws.mobileconnectors.s3.transferutility.TransferStatusUpdater.3

                                    /* renamed from: b, reason: collision with root package name */
                                    public final /* synthetic */ long f28705b;

                                    /* renamed from: c, reason: collision with root package name */
                                    public final /* synthetic */ long f28706c;

                                    {
                                        this.f28705b = j13;
                                        this.f28706c = j14;
                                    }

                                    @Override // java.lang.Runnable
                                    public final void run() {
                                        TransferListener.this.b(this.f28705b, this.f28706c);
                                    }
                                });
                            }
                        }
                    } finally {
                    }
                }
            }
        } catch (Throwable th3) {
            throw th3;
        }
    }

    public final synchronized void g(int i13, TransferState transferState) {
        try {
            boolean contains = f28696d.contains(transferState);
            TransferRecord transferRecord = (TransferRecord) this.f28700a.get(Integer.valueOf(i13));
            if (transferRecord == null) {
                f28698f.getClass();
                if (TransferDBUtil.h(i13, transferState) == 0) {
                    f28695c.h("Failed to update the status of transfer " + i13);
                }
            } else {
                contains |= transferState.equals(transferRecord.f28676j);
                transferRecord.f28676j = transferState;
                f28698f.getClass();
                if (TransferDBUtil.i(transferRecord) == 0) {
                    f28695c.h("Failed to update the status of transfer " + i13);
                }
            }
            if (contains) {
                return;
            }
            if (TransferState.COMPLETED.equals(transferState)) {
                c(i13);
            }
            Map map = f28697e;
            synchronized (map) {
                try {
                    List<TransferListener> list = (List) ((ConcurrentHashMap) map).get(Integer.valueOf(i13));
                    if (list != null && !list.isEmpty()) {
                        for (TransferListener transferListener : list) {
                            if (transferListener instanceof TransferObserver.TransferStatusListener) {
                                transferListener.a(transferState);
                            } else {
                                this.f28701b.post(new Runnable(i13, transferState) { // from class: com.amazonaws.mobileconnectors.s3.transferutility.TransferStatusUpdater.2

                                    /* renamed from: b, reason: collision with root package name */
                                    public final /* synthetic */ TransferState f28703b;

                                    {
                                        this.f28703b = transferState;
                                    }

                                    @Override // java.lang.Runnable
                                    public final void run() {
                                        TransferListener.this.a(this.f28703b);
                                    }
                                });
                            }
                        }
                        if (TransferState.isFinalState(transferState)) {
                            list.clear();
                        }
                    }
                } finally {
                }
            }
        } catch (Throwable th3) {
            throw th3;
        }
    }
}
