package com.amazonaws.mobileconnectors.s3.transferutility;

import a.a;
import android.database.Cursor;
import com.pinterest.shuffles.scene.composer.AnimatedTarget;
import java.io.File;
import sv0.n;

/* loaded from: classes3.dex */
public class TransferObserver {

    /* renamed from: a, reason: collision with root package name */
    public final int f28656a;

    /* renamed from: b, reason: collision with root package name */
    public final TransferDBUtil f28657b;

    /* renamed from: c, reason: collision with root package name */
    public String f28658c;

    /* renamed from: d, reason: collision with root package name */
    public String f28659d;

    /* renamed from: e, reason: collision with root package name */
    public long f28660e;

    /* renamed from: f, reason: collision with root package name */
    public long f28661f;

    /* renamed from: g, reason: collision with root package name */
    public TransferState f28662g;

    /* renamed from: h, reason: collision with root package name */
    public String f28663h;

    /* renamed from: i, reason: collision with root package name */
    public TransferListener f28664i;

    /* renamed from: j, reason: collision with root package name */
    public TransferStatusListener f28665j;

    public class TransferStatusListener implements TransferListener {
        public TransferStatusListener() {
        }

        @Override // com.amazonaws.mobileconnectors.s3.transferutility.TransferListener
        public final void a(TransferState transferState) {
            TransferObserver.this.f28662g = transferState;
        }

        @Override // com.amazonaws.mobileconnectors.s3.transferutility.TransferListener
        public final void b(long j13, long j14) {
            TransferObserver transferObserver = TransferObserver.this;
            transferObserver.f28661f = j13;
            transferObserver.f28660e = j14;
        }

        @Override // com.amazonaws.mobileconnectors.s3.transferutility.TransferListener
        public final void c(Exception exc) {
        }
    }

    public TransferObserver(int i13, TransferDBUtil transferDBUtil, String str, String str2, File file) {
        this.f28656a = i13;
        this.f28657b = transferDBUtil;
        this.f28658c = str;
        this.f28659d = str2;
        this.f28663h = file.getAbsolutePath();
        this.f28660e = file.length();
        this.f28662g = TransferState.WAITING;
        c(null);
    }

    public final void a() {
        synchronized (this) {
            try {
                TransferListener transferListener = this.f28664i;
                if (transferListener != null) {
                    TransferStatusUpdater.e(this.f28656a, transferListener);
                    this.f28664i = null;
                }
                TransferStatusListener transferStatusListener = this.f28665j;
                if (transferStatusListener != null) {
                    TransferStatusUpdater.e(this.f28656a, transferStatusListener);
                    this.f28665j = null;
                }
            } catch (Throwable th3) {
                throw th3;
            }
        }
    }

    public final void b() {
        Cursor cursor = null;
        try {
            TransferDBUtil transferDBUtil = this.f28657b;
            int i13 = this.f28656a;
            transferDBUtil.getClass();
            cursor = TransferDBUtil.f28651c.b(TransferDBUtil.e(i13));
            if (cursor.moveToFirst()) {
                d(cursor);
            }
            cursor.close();
        } catch (Throwable th3) {
            if (cursor != null) {
                cursor.close();
            }
            throw th3;
        }
    }

    public final void c(n nVar) {
        synchronized (this) {
            try {
                a();
                if (this.f28665j == null) {
                    TransferStatusListener transferStatusListener = new TransferStatusListener();
                    this.f28665j = transferStatusListener;
                    TransferStatusUpdater.b(this.f28656a, transferStatusListener);
                }
                if (nVar != null) {
                    this.f28664i = nVar;
                    nVar.a(this.f28662g);
                    TransferStatusUpdater.b(this.f28656a, this.f28664i);
                }
            } catch (Throwable th3) {
                throw th3;
            }
        }
    }

    public final void d(Cursor cursor) {
        this.f28658c = cursor.getString(cursor.getColumnIndexOrThrow("bucket_name"));
        this.f28659d = cursor.getString(cursor.getColumnIndexOrThrow("key"));
        this.f28660e = cursor.getLong(cursor.getColumnIndexOrThrow("bytes_total"));
        this.f28661f = cursor.getLong(cursor.getColumnIndexOrThrow("bytes_current"));
        this.f28662g = TransferState.getState(cursor.getString(cursor.getColumnIndexOrThrow(AnimatedTarget.PROPERTY_STATE)));
        this.f28663h = cursor.getString(cursor.getColumnIndexOrThrow("file"));
    }

    public final String toString() {
        StringBuilder sb3 = new StringBuilder("TransferObserver{id=");
        sb3.append(this.f28656a);
        sb3.append(", bucket='");
        sb3.append(this.f28658c);
        sb3.append("', key='");
        sb3.append(this.f28659d);
        sb3.append("', bytesTotal=");
        sb3.append(this.f28660e);
        sb3.append(", bytesTransferred=");
        sb3.append(this.f28661f);
        sb3.append(", transferState=");
        sb3.append(this.f28662g);
        sb3.append(", filePath='");
        return a.p(sb3, this.f28663h, "'}");
    }

    public TransferObserver(int i13, TransferDBUtil transferDBUtil) {
        this.f28656a = i13;
        this.f28657b = transferDBUtil;
    }
}
