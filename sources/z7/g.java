package z7;

import android.content.ContentValues;
import android.database.Cursor;
import android.database.SQLException;
import android.database.sqlite.SQLiteException;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Message;
import androidx.media3.common.StreamKey;
import androidx.media3.database.DatabaseIOException;
import androidx.media3.exoplayer.offline.DownloadRequest;
import d7.n0;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import v.j2;

/* loaded from: classes3.dex */
public final class g extends Handler {

    /* renamed from: m, reason: collision with root package name */
    public static final /* synthetic */ int f140919m = 0;

    /* renamed from: a, reason: collision with root package name */
    public final HandlerThread f140920a;

    /* renamed from: b, reason: collision with root package name */
    public final v f140921b;

    /* renamed from: c, reason: collision with root package name */
    public final m f140922c;

    /* renamed from: d, reason: collision with root package name */
    public final Handler f140923d;

    /* renamed from: e, reason: collision with root package name */
    public final ArrayList f140924e;

    /* renamed from: f, reason: collision with root package name */
    public final HashMap f140925f;

    /* renamed from: g, reason: collision with root package name */
    public int f140926g;

    /* renamed from: h, reason: collision with root package name */
    public boolean f140927h;

    /* renamed from: i, reason: collision with root package name */
    public int f140928i;

    /* renamed from: j, reason: collision with root package name */
    public int f140929j;

    /* renamed from: k, reason: collision with root package name */
    public int f140930k;

    /* renamed from: l, reason: collision with root package name */
    public boolean f140931l;

    public g(HandlerThread handlerThread, b bVar, c cVar, Handler handler, int i13, boolean z13) {
        super(handlerThread.getLooper());
        this.f140920a = handlerThread;
        this.f140921b = bVar;
        this.f140922c = cVar;
        this.f140923d = handler;
        this.f140928i = i13;
        this.f140929j = 5;
        this.f140927h = z13;
        this.f140924e = new ArrayList();
        this.f140925f = new HashMap();
    }

    public static d a(d dVar, int i13, int i14) {
        return new d(dVar.f140908a, i13, dVar.f140910c, System.currentTimeMillis(), dVar.f140912e, i14, 0, dVar.f140915h);
    }

    public final d b(String str, boolean z13) {
        int c13 = c(str);
        if (c13 != -1) {
            return (d) this.f140924e.get(c13);
        }
        if (!z13) {
            return null;
        }
        try {
            return ((b) this.f140921b).d(str);
        } catch (IOException e13) {
            d7.u.d("DownloadManager", "Failed to load download: " + str, e13);
            return null;
        }
    }

    public final int c(String str) {
        int i13 = 0;
        while (true) {
            ArrayList arrayList = this.f140924e;
            if (i13 >= arrayList.size()) {
                return -1;
            }
            if (((d) arrayList.get(i13)).f140908a.f18829a.equals(str)) {
                return i13;
            }
            i13++;
        }
    }

    public final void d(d dVar) {
        int i13 = dVar.f140909b;
        int i14 = 4;
        int i15 = 3;
        bf.b.t((i13 == 3 || i13 == 4) ? false : true);
        int c13 = c(dVar.f140908a.f18829a);
        ArrayList arrayList = this.f140924e;
        if (c13 == -1) {
            arrayList.add(dVar);
            Collections.sort(arrayList, new j2(i15));
        } else {
            boolean z13 = dVar.f140910c != ((d) arrayList.get(c13)).f140910c;
            arrayList.set(c13, dVar);
            if (z13) {
                Collections.sort(arrayList, new j2(i14));
            }
        }
        try {
            ((b) this.f140921b).i(dVar);
        } catch (IOException e13) {
            d7.u.d("DownloadManager", "Failed to update index.", e13);
        }
        this.f140923d.obtainMessage(3, new f(dVar, false, new ArrayList(arrayList), null)).sendToTarget();
    }

    public final d e(d dVar, int i13, int i14) {
        bf.b.t((i13 == 3 || i13 == 4) ? false : true);
        d a13 = a(dVar, i13, i14);
        d(a13);
        return a13;
    }

    public final void f(d dVar, int i13) {
        if (i13 == 0) {
            if (dVar.f140909b == 1) {
                e(dVar, 0, 0);
            }
        } else if (i13 != dVar.f140913f) {
            int i14 = dVar.f140909b;
            if (i14 == 0 || i14 == 2) {
                i14 = 1;
            }
            d(new d(dVar.f140908a, i14, dVar.f140910c, System.currentTimeMillis(), dVar.f140912e, i13, 0, dVar.f140915h));
        }
    }

    public final void g() {
        int i13 = 0;
        int i14 = 0;
        while (true) {
            ArrayList arrayList = this.f140924e;
            if (i13 >= arrayList.size()) {
                return;
            }
            d dVar = (d) arrayList.get(i13);
            HashMap hashMap = this.f140925f;
            h hVar = (h) hashMap.get(dVar.f140908a.f18829a);
            m mVar = this.f140922c;
            int i15 = dVar.f140909b;
            if (i15 != 0) {
                if (i15 != 1) {
                    if (i15 == 2) {
                        hVar.getClass();
                        bf.b.t(!hVar.f140935d);
                        if (this.f140927h || this.f140926g != 0 || i14 >= this.f140928i) {
                            e(dVar, 0, 0);
                            hVar.a(false);
                        }
                    } else {
                        if (i15 != 5 && i15 != 7) {
                            throw new IllegalStateException();
                        }
                        if (hVar != null) {
                            if (!hVar.f140935d) {
                                hVar.a(false);
                            }
                        } else if (!this.f140931l) {
                            DownloadRequest downloadRequest = dVar.f140908a;
                            h hVar2 = new h(dVar.f140908a, ((c) mVar).a(downloadRequest), dVar.f140915h, true, this.f140929j, this);
                            hashMap.put(downloadRequest.f18829a, hVar2);
                            this.f140931l = true;
                            hVar2.start();
                        }
                    }
                } else if (hVar != null) {
                    bf.b.t(!hVar.f140935d);
                    hVar.a(false);
                }
            } else if (hVar != null) {
                bf.b.t(!hVar.f140935d);
                hVar.a(false);
            } else if (this.f140927h || this.f140926g != 0 || this.f140930k >= this.f140928i) {
                hVar = null;
            } else {
                d e13 = e(dVar, 2, 0);
                DownloadRequest downloadRequest2 = e13.f140908a;
                h hVar3 = new h(e13.f140908a, ((c) mVar).a(downloadRequest2), e13.f140915h, false, this.f140929j, this);
                hashMap.put(downloadRequest2.f18829a, hVar3);
                int i16 = this.f140930k;
                this.f140930k = i16 + 1;
                if (i16 == 0) {
                    sendEmptyMessageDelayed(12, 5000L);
                }
                hVar3.start();
                hVar = hVar3;
            }
            if (hVar != null && !hVar.f140935d) {
                i14++;
            }
            i13++;
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r6v1, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r6v2 */
    /* JADX WARN: Type inference failed for: r6v5, types: [java.util.ArrayList] */
    @Override // android.os.Handler
    public final void handleMessage(Message message) {
        a aVar;
        Cursor cursor;
        List emptyList;
        a aVar2 = null;
        int i13 = 5;
        int i14 = 0;
        r10 = 0;
        int i15 = 0;
        int i16 = 0;
        switch (message.what) {
            case 1:
                int i17 = message.arg1;
                v vVar = this.f140921b;
                ArrayList arrayList = this.f140924e;
                this.f140926g = i17;
                try {
                    try {
                        ((b) vVar).k();
                        b bVar = (b) vVar;
                        bVar.b();
                        aVar = new a(bVar.c(b.g(0, 1, 2, 5, 7), null));
                    } catch (IOException e13) {
                        e = e13;
                    }
                    while (true) {
                        try {
                            cursor = aVar.f140899a;
                        } catch (IOException e14) {
                            e = e14;
                            aVar2 = aVar;
                            d7.u.d("DownloadManager", "Failed to load index.", e);
                            arrayList.clear();
                            n0.g(aVar2);
                            this.f140923d.obtainMessage(1, new ArrayList(arrayList)).sendToTarget();
                            g();
                            i15 = 1;
                            this.f140923d.obtainMessage(2, i15, this.f140925f.size()).sendToTarget();
                            return;
                        } catch (Throwable th3) {
                            th = th3;
                            aVar2 = aVar;
                            n0.g(aVar2);
                            throw th;
                        }
                        if (!cursor.moveToPosition(cursor.getPosition() + 1)) {
                            n0.g(aVar);
                            this.f140923d.obtainMessage(1, new ArrayList(arrayList)).sendToTarget();
                            g();
                            i15 = 1;
                            this.f140923d.obtainMessage(2, i15, this.f140925f.size()).sendToTarget();
                            return;
                        }
                        arrayList.add(b.e(aVar.f140899a));
                    }
                } catch (Throwable th4) {
                    th = th4;
                }
            case 2:
                this.f140927h = message.arg1 != 0;
                g();
                i15 = 1;
                this.f140923d.obtainMessage(2, i15, this.f140925f.size()).sendToTarget();
                return;
            case 3:
                this.f140926g = message.arg1;
                g();
                i15 = 1;
                this.f140923d.obtainMessage(2, i15, this.f140925f.size()).sendToTarget();
                return;
            case 4:
                String str = (String) message.obj;
                int i18 = message.arg1;
                v vVar2 = this.f140921b;
                if (str == null) {
                    while (true) {
                        ArrayList arrayList2 = this.f140924e;
                        if (i16 < arrayList2.size()) {
                            f((d) arrayList2.get(i16), i18);
                            i16++;
                        } else {
                            try {
                                b bVar2 = (b) vVar2;
                                bVar2.b();
                                try {
                                    ContentValues contentValues = new ContentValues();
                                    contentValues.put("stop_reason", Integer.valueOf(i18));
                                    bVar2.f140902a.getWritableDatabase().update("ExoPlayerDownloads", contentValues, b.f140900d, null);
                                } catch (SQLException e15) {
                                    throw new DatabaseIOException((Throwable) e15);
                                }
                            } catch (IOException e16) {
                                d7.u.d("DownloadManager", "Failed to set manual stop reason", e16);
                            }
                        }
                    }
                } else {
                    d b13 = b(str, false);
                    if (b13 != null) {
                        f(b13, i18);
                    } else {
                        try {
                            ((b) vVar2).m(i18, str);
                        } catch (IOException e17) {
                            d7.u.d("DownloadManager", "Failed to set manual stop reason: ".concat(str), e17);
                        }
                    }
                }
                g();
                i15 = 1;
                this.f140923d.obtainMessage(2, i15, this.f140925f.size()).sendToTarget();
                return;
            case 5:
                this.f140928i = message.arg1;
                g();
                i15 = 1;
                this.f140923d.obtainMessage(2, i15, this.f140925f.size()).sendToTarget();
                return;
            case 6:
                this.f140929j = message.arg1;
                i15 = 1;
                this.f140923d.obtainMessage(2, i15, this.f140925f.size()).sendToTarget();
                return;
            case 7:
                DownloadRequest downloadRequest = (DownloadRequest) message.obj;
                int i19 = message.arg1;
                d b14 = b(downloadRequest.f18829a, true);
                long currentTimeMillis = System.currentTimeMillis();
                if (b14 != null) {
                    int i23 = b14.f140909b;
                    long j13 = (i23 == 5 || i23 == 3 || i23 == 4) ? currentTimeMillis : b14.f140910c;
                    int i24 = (i23 == 5 || i23 == 7) ? 7 : i19 != 0 ? 1 : 0;
                    DownloadRequest downloadRequest2 = b14.f140908a;
                    downloadRequest2.getClass();
                    bf.b.i(downloadRequest2.f18829a.equals(downloadRequest.f18829a));
                    List list = downloadRequest2.f18832d;
                    if (!list.isEmpty()) {
                        List list2 = downloadRequest.f18832d;
                        if (!list2.isEmpty()) {
                            emptyList = new ArrayList(list);
                            for (int i25 = 0; i25 < list2.size(); i25++) {
                                StreamKey streamKey = (StreamKey) list2.get(i25);
                                if (!emptyList.contains(streamKey)) {
                                    emptyList.add(streamKey);
                                }
                            }
                            d(new d(new DownloadRequest(downloadRequest2.f18829a, downloadRequest.f18830b, downloadRequest.f18831c, emptyList, downloadRequest.f18833e, downloadRequest.f18834f, downloadRequest.f18835g, downloadRequest.f18836h), i24, j13, currentTimeMillis, i19));
                        }
                    }
                    emptyList = Collections.emptyList();
                    d(new d(new DownloadRequest(downloadRequest2.f18829a, downloadRequest.f18830b, downloadRequest.f18831c, emptyList, downloadRequest.f18833e, downloadRequest.f18834f, downloadRequest.f18835g, downloadRequest.f18836h), i24, j13, currentTimeMillis, i19));
                } else {
                    d(new d(downloadRequest, i19 != 0 ? 1 : 0, currentTimeMillis, currentTimeMillis, i19));
                }
                g();
                i15 = 1;
                this.f140923d.obtainMessage(2, i15, this.f140925f.size()).sendToTarget();
                return;
            case 8:
                String str2 = (String) message.obj;
                d b15 = b(str2, true);
                if (b15 == null) {
                    d7.u.c("DownloadManager", "Failed to remove nonexistent download: " + str2);
                } else {
                    e(b15, 5, 0);
                    g();
                }
                i15 = 1;
                this.f140923d.obtainMessage(2, i15, this.f140925f.size()).sendToTarget();
                return;
            case 9:
                v vVar3 = this.f140921b;
                ArrayList arrayList3 = new ArrayList();
                try {
                    b bVar3 = (b) vVar3;
                    bVar3.b();
                    Cursor c13 = bVar3.c(b.g(3, 4), null);
                    while (c13.moveToPosition(c13.getPosition() + 1)) {
                        try {
                            arrayList3.add(b.e(c13));
                        } finally {
                        }
                    }
                    c13.close();
                } catch (IOException unused) {
                    d7.u.c("DownloadManager", "Failed to load downloads.");
                }
                int i26 = 0;
                while (true) {
                    ArrayList arrayList4 = this.f140924e;
                    if (i26 >= arrayList4.size()) {
                        for (int i27 = 0; i27 < arrayList3.size(); i27++) {
                            arrayList4.add(a((d) arrayList3.get(i27), 5, 0));
                        }
                        Collections.sort(arrayList4, new j2(i13));
                        try {
                            ((b) vVar3).l();
                        } catch (IOException e18) {
                            d7.u.d("DownloadManager", "Failed to update index.", e18);
                        }
                        ArrayList arrayList5 = new ArrayList(arrayList4);
                        for (int i28 = 0; i28 < arrayList4.size(); i28++) {
                            this.f140923d.obtainMessage(3, new f((d) arrayList4.get(i28), false, arrayList5, null)).sendToTarget();
                        }
                        g();
                        i15 = 1;
                        this.f140923d.obtainMessage(2, i15, this.f140925f.size()).sendToTarget();
                        return;
                    }
                    arrayList4.set(i26, a((d) arrayList4.get(i26), 5, 0));
                    i26++;
                }
            case 10:
                h hVar = (h) message.obj;
                String str3 = hVar.f140932a.f18829a;
                this.f140925f.remove(str3);
                boolean z13 = hVar.f140935d;
                if (z13) {
                    this.f140931l = false;
                } else {
                    int i29 = this.f140930k - 1;
                    this.f140930k = i29;
                    if (i29 == 0) {
                        removeMessages(12);
                    }
                }
                if (hVar.f140938g) {
                    g();
                } else {
                    Exception exc = hVar.f140939h;
                    if (exc != null) {
                        d7.u.d("DownloadManager", "Task failed: " + hVar.f140932a + ", " + z13, exc);
                    }
                    d b16 = b(str3, false);
                    b16.getClass();
                    int i33 = b16.f140909b;
                    if (i33 == 2) {
                        bf.b.t(!z13);
                        d dVar = new d(b16.f140908a, exc == null ? 3 : 4, b16.f140910c, System.currentTimeMillis(), b16.f140912e, b16.f140913f, exc == null ? 0 : 1, b16.f140915h);
                        ArrayList arrayList6 = this.f140924e;
                        arrayList6.remove(c(dVar.f140908a.f18829a));
                        try {
                            ((b) this.f140921b).i(dVar);
                        } catch (IOException e19) {
                            d7.u.d("DownloadManager", "Failed to update index.", e19);
                        }
                        this.f140923d.obtainMessage(3, new f(dVar, false, new ArrayList(arrayList6), exc)).sendToTarget();
                    } else {
                        if (i33 != 5 && i33 != 7) {
                            throw new IllegalStateException();
                        }
                        bf.b.t(z13);
                        if (b16.f140909b == 7) {
                            int i34 = b16.f140913f;
                            e(b16, i34 == 0 ? 0 : 1, i34);
                            g();
                        } else {
                            DownloadRequest downloadRequest3 = b16.f140908a;
                            int c14 = c(downloadRequest3.f18829a);
                            ArrayList arrayList7 = this.f140924e;
                            arrayList7.remove(c14);
                            try {
                                v vVar4 = this.f140921b;
                                String str4 = downloadRequest3.f18829a;
                                b bVar4 = (b) vVar4;
                                bVar4.b();
                                try {
                                    bVar4.f140902a.getWritableDatabase().delete("ExoPlayerDownloads", "id = ?", new String[]{str4});
                                } catch (SQLiteException e23) {
                                    throw new DatabaseIOException((Throwable) e23);
                                }
                            } catch (IOException unused2) {
                                d7.u.c("DownloadManager", "Failed to remove from database");
                            }
                            this.f140923d.obtainMessage(3, new f(b16, true, new ArrayList(arrayList7), null)).sendToTarget();
                        }
                    }
                    g();
                }
                this.f140923d.obtainMessage(2, i15, this.f140925f.size()).sendToTarget();
                return;
            case 11:
                h hVar2 = (h) message.obj;
                int i35 = message.arg1;
                int i36 = message.arg2;
                int i37 = n0.f53866a;
                long j14 = ((i35 & 4294967295L) << 32) | (4294967295L & i36);
                d b17 = b(hVar2.f140932a.f18829a, false);
                b17.getClass();
                if (j14 == b17.f140912e || j14 == -1) {
                    return;
                }
                d(new d(b17.f140908a, b17.f140909b, b17.f140910c, System.currentTimeMillis(), j14, b17.f140913f, b17.f140914g, b17.f140915h));
                return;
            case 12:
                while (true) {
                    ArrayList arrayList8 = this.f140924e;
                    if (i14 >= arrayList8.size()) {
                        sendEmptyMessageDelayed(12, 5000L);
                        return;
                    }
                    d dVar2 = (d) arrayList8.get(i14);
                    if (dVar2.f140909b == 2) {
                        try {
                            ((b) this.f140921b).i(dVar2);
                        } catch (IOException e24) {
                            d7.u.d("DownloadManager", "Failed to update index.", e24);
                        }
                    }
                    i14++;
                }
            case 13:
                Iterator it = this.f140925f.values().iterator();
                while (it.hasNext()) {
                    ((h) it.next()).a(true);
                }
                try {
                    ((b) this.f140921b).k();
                } catch (IOException e25) {
                    d7.u.d("DownloadManager", "Failed to update index.", e25);
                }
                this.f140924e.clear();
                this.f140920a.quit();
                synchronized (this) {
                    notifyAll();
                }
                return;
            default:
                throw new IllegalStateException();
        }
    }
}
