package ads_mobile_sdk;

import a.jh;
import android.util.Base64;
import android.view.MotionEvent;
import com.google.android.gms.tasks.TaskCompletionSource;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes2.dex */
public final class k71 {

    /* renamed from: a, reason: collision with root package name */
    public final Object f7145a;

    /* renamed from: b, reason: collision with root package name */
    public final jh f7146b;

    /* renamed from: c, reason: collision with root package name */
    public final a.se f7147c;

    /* renamed from: d, reason: collision with root package name */
    public final boolean f7148d;

    public k71(Object obj, jh jhVar, a.se seVar, boolean z13) {
        this.f7145a = obj;
        this.f7146b = jhVar;
        this.f7147c = seVar;
        this.f7148d = z13;
    }

    public final synchronized void a() {
        try {
            long currentTimeMillis = System.currentTimeMillis();
            this.f7145a.getClass().getDeclaredMethod("close", new Class[0]).invoke(this.f7145a, new Object[0]);
            a.se seVar = this.f7147c;
            ((x71) ((x3) seVar).f13404a).a(3001, System.currentTimeMillis() - currentTimeMillis, null, null);
            TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
            taskCompletionSource.setResult(Boolean.TRUE);
            taskCompletionSource.getTask();
        } catch (Exception e13) {
            throw new xy2(2003, e13);
        }
    }

    public final synchronized int b() {
        try {
        } catch (Exception e13) {
            throw new xy2(2006, e13);
        }
        return ((Integer) this.f7145a.getClass().getDeclaredMethod("lcs", new Class[0]).invoke(this.f7145a, new Object[0])).intValue();
    }

    public final synchronized boolean c() {
        try {
        } catch (Exception e13) {
            throw new xy2(2001, e13);
        }
        return ((Boolean) this.f7145a.getClass().getDeclaredMethod("init", new Class[0]).invoke(this.f7145a, new Object[0])).booleanValue();
    }

    public final synchronized void a(MotionEvent motionEvent) {
        try {
            long currentTimeMillis = System.currentTimeMillis();
            ((l90) this.f7146b).getClass();
            HashMap hashMap = new HashMap();
            hashMap.put("t", new Throwable());
            hashMap.put("aid", null);
            hashMap.put("evt", motionEvent);
            this.f7145a.getClass().getDeclaredMethod("he", Map.class).invoke(this.f7145a, hashMap);
            ((x71) ((x3) this.f7147c).f13404a).a(3003, System.currentTimeMillis() - currentTimeMillis, null, null);
            TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
            taskCompletionSource.setResult(Boolean.TRUE);
            taskCompletionSource.getTask();
        } catch (Exception e13) {
            throw new xy2(2005, e13);
        }
    }

    public static String a(byte[] bArr) {
        int i13;
        if (bArr == null) {
            return null;
        }
        a.da r13 = qc.r();
        ec ecVar = ec.DG;
        r13.b();
        qc qcVar = (qc) r13.f10110b;
        qcVar.getClass();
        qcVar.encryptionMethod_ = ecVar.f4800a;
        i13 = qcVar.bitField0_;
        qcVar.bitField0_ = i13 | 4;
        r13.g(il.a(bArr));
        return Base64.encodeToString(((qc) r13.a()).a(), 11);
    }

    public final synchronized byte[] a(HashMap hashMap) {
        long currentTimeMillis = System.currentTimeMillis();
        try {
        } catch (Exception e13) {
            this.f7147c.a(2007, System.currentTimeMillis() - currentTimeMillis, e13);
            return null;
        }
        return (byte[]) this.f7145a.getClass().getDeclaredMethod("xss", Map.class, Map.class).invoke(this.f7145a, null, hashMap);
    }
}
