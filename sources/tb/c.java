package tb;

import a7.o1;
import android.content.Context;
import android.content.res.TypedArray;
import android.database.Cursor;
import android.graphics.ImageDecoder;
import android.graphics.drawable.Drawable;
import android.os.Handler;
import android.os.IBinder;
import android.os.Messenger;
import android.os.Parcel;
import android.os.PowerManager;
import android.os.RemoteException;
import android.text.method.KeyListener;
import android.text.method.NumberKeyListener;
import android.util.AttributeSet;
import android.util.Log;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.widget.EditText;
import com.google.android.gms.auth.api.identity.BeginSignInRequest;
import com.google.android.gms.cloudmessaging.zzd;
import com.google.android.gms.tasks.TaskCompletionSource;
import ja.d0;
import ja.f0;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import pk.c1;
import pk.v2;
import wd.c0;

/* loaded from: classes.dex */
public final class c implements com.google.android.gms.common.api.internal.o, pm.p, nf0.b {

    /* renamed from: a, reason: collision with root package name */
    public Object f116959a;

    /* renamed from: b, reason: collision with root package name */
    public Object f116960b;

    public c(int i13) {
        if (i13 != 17) {
            this.f116959a = new HashSet(c02.o.values().length);
            this.f116960b = new HashMap();
        }
    }

    public static c0 c(ImageDecoder.Source source, int i13, int i14, nd.l lVar) {
        Drawable decodeDrawable;
        decodeDrawable = ImageDecoder.decodeDrawable(source, new vd.b(i13, i14, lVar));
        if (o5.d.x(decodeDrawable)) {
            return new c0(o5.d.i(decodeDrawable), 2);
        }
        throw new IOException("Received unexpected drawable type for animated image, failing: " + decodeDrawable);
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x003a A[Catch: IOException -> 0x005b, TryCatch #0 {IOException -> 0x005b, blocks: (B:2:0x0000, B:3:0x000a, B:5:0x000d, B:7:0x001e, B:9:0x0026, B:13:0x0042, B:15:0x003a, B:16:0x003d, B:27:0x0047, B:29:0x004a, B:32:0x005d), top: B:1:0x0000 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static tb.c k(java.lang.String... r12) {
        /*
            int r0 = r12.length     // Catch: java.io.IOException -> L5b
            wo2.m[] r0 = new wo2.m[r0]     // Catch: java.io.IOException -> L5b
            wo2.j r1 = new wo2.j     // Catch: java.io.IOException -> L5b
            r1.<init>()     // Catch: java.io.IOException -> L5b
            r2 = 0
            r3 = r2
        La:
            int r4 = r12.length     // Catch: java.io.IOException -> L5b
            if (r3 >= r4) goto L5d
            r4 = r12[r3]     // Catch: java.io.IOException -> L5b
            java.lang.String[] r5 = ic.d.f72048e     // Catch: java.io.IOException -> L5b
            r6 = 34
            r1.a0(r6)     // Catch: java.io.IOException -> L5b
            int r7 = r4.length()     // Catch: java.io.IOException -> L5b
            r8 = r2
            r9 = r8
        L1c:
            if (r8 >= r7) goto L45
            char r10 = r4.charAt(r8)     // Catch: java.io.IOException -> L5b
            r11 = 128(0x80, float:1.8E-43)
            if (r10 >= r11) goto L2b
            r10 = r5[r10]     // Catch: java.io.IOException -> L5b
            if (r10 != 0) goto L38
            goto L42
        L2b:
            r11 = 8232(0x2028, float:1.1535E-41)
            if (r10 != r11) goto L32
            java.lang.String r10 = "\\u2028"
            goto L38
        L32:
            r11 = 8233(0x2029, float:1.1537E-41)
            if (r10 != r11) goto L42
            java.lang.String r10 = "\\u2029"
        L38:
            if (r9 >= r8) goto L3d
            r1.q0(r9, r8, r4)     // Catch: java.io.IOException -> L5b
        L3d:
            r1.r0(r10)     // Catch: java.io.IOException -> L5b
            int r9 = r8 + 1
        L42:
            int r8 = r8 + 1
            goto L1c
        L45:
            if (r9 >= r7) goto L4a
            r1.q0(r9, r7, r4)     // Catch: java.io.IOException -> L5b
        L4a:
            r1.a0(r6)     // Catch: java.io.IOException -> L5b
            r1.readByte()     // Catch: java.io.IOException -> L5b
            long r4 = r1.f130711b     // Catch: java.io.IOException -> L5b
            wo2.m r4 = r1.a1(r4)     // Catch: java.io.IOException -> L5b
            r0[r3] = r4     // Catch: java.io.IOException -> L5b
            int r3 = r3 + 1
            goto La
        L5b:
            r12 = move-exception
            goto L6f
        L5d:
            tb.c r1 = new tb.c     // Catch: java.io.IOException -> L5b
            java.lang.Object r12 = r12.clone()     // Catch: java.io.IOException -> L5b
            java.lang.String[] r12 = (java.lang.String[]) r12     // Catch: java.io.IOException -> L5b
            int r2 = wo2.v.f130737d     // Catch: java.io.IOException -> L5b
            wo2.v r0 = ln2.k.j(r0)     // Catch: java.io.IOException -> L5b
            r1.<init>(r12, r0)     // Catch: java.io.IOException -> L5b
            return r1
        L6f:
            java.lang.AssertionError r0 = new java.lang.AssertionError
            r0.<init>(r12)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: tb.c.k(java.lang.String[]):tb.c");
    }

    public final void a(c02.n nVar, c02.o oVar) {
        if (((Set) this.f116959a).contains(oVar)) {
            Iterator it = ((Map) this.f116960b).entrySet().iterator();
            while (it.hasNext()) {
                ((List) ((Map.Entry) it.next()).getValue()).remove(oVar);
            }
            ((Set) this.f116959a).remove(oVar);
        }
        List list = (List) ((Map) this.f116960b).get(nVar);
        if (list == null) {
            list = new ArrayList(1);
            ((Map) this.f116960b).put(nVar, list);
        }
        list.add(oVar);
        ((Set) this.f116959a).add(oVar);
    }

    @Override // com.google.android.gms.common.api.internal.o
    public final void accept(Object obj, Object obj2) {
        ai.d dVar = new ai.d((TaskCompletionSource) obj2);
        ai.q qVar = (ai.q) ((ai.h) obj).getService();
        BeginSignInRequest beginSignInRequest = (BeginSignInRequest) this.f116960b;
        com.bumptech.glide.d.t(beginSignInRequest);
        Parcel C = qVar.C();
        int i13 = ai.l.f15231a;
        C.writeStrongBinder(dVar);
        ai.l.c(C, beginSignInRequest);
        qVar.D(C, 1);
    }

    public final ja.c0 b() {
        for (c02.o oVar : c02.o.values()) {
            if (!((Set) this.f116959a).contains(oVar)) {
                a(c02.n.ANIMATION_SLOT_ONE, oVar);
            }
        }
        ((Set) this.f116959a).clear();
        return new ja.c0(this);
    }

    public final synchronized void d(sp2.j jVar) {
        try {
            Object obj = this.f116960b;
            if (((sp2.j) obj) != null) {
                ((sp2.j) obj).f114933c = jVar;
                this.f116960b = jVar;
            } else {
                if (((sp2.j) this.f116959a) != null) {
                    throw new IllegalStateException("Head present, but no tail");
                }
                this.f116960b = jVar;
                this.f116959a = jVar;
            }
            notifyAll();
        } catch (Throwable th3) {
            throw th3;
        }
    }

    public final ArrayList e(String str) {
        f0 d2 = f0.d(1, "SELECT work_spec_id FROM dependency WHERE prerequisite_id=?");
        d2.c1(1, str);
        ((d0) this.f116959a).b();
        Cursor m03 = d7.b.m0((d0) this.f116959a, d2, false);
        try {
            ArrayList arrayList = new ArrayList(m03.getCount());
            while (m03.moveToNext()) {
                arrayList.add(m03.getString(0));
            }
            return arrayList;
        } finally {
            m03.close();
            d2.e();
        }
    }

    public final KeyListener f(KeyListener keyListener) {
        return (keyListener instanceof NumberKeyListener) ^ true ? ((e3.b) ((j6.b) this.f116960b).f74795c).c(keyListener) : keyListener;
    }

    public final boolean g(String str) {
        f0 d2 = f0.d(1, "SELECT COUNT(*)=0 FROM dependency WHERE work_spec_id=? AND prerequisite_id IN (SELECT id FROM workspec WHERE state!=2)");
        d2.c1(1, str);
        ((d0) this.f116959a).b();
        boolean z13 = false;
        Cursor m03 = d7.b.m0((d0) this.f116959a, d2, false);
        try {
            if (m03.moveToFirst()) {
                z13 = m03.getInt(0) != 0;
            }
            return z13;
        } finally {
            m03.close();
            d2.e();
        }
    }

    public final boolean h(String str) {
        f0 d2 = f0.d(1, "SELECT COUNT(*)>0 FROM dependency WHERE prerequisite_id=?");
        d2.c1(1, str);
        ((d0) this.f116959a).b();
        boolean z13 = false;
        Cursor m03 = d7.b.m0((d0) this.f116959a, d2, false);
        try {
            if (m03.moveToFirst()) {
                z13 = m03.getInt(0) != 0;
            }
            return z13;
        } finally {
            m03.close();
            d2.e();
        }
    }

    public final void i(a aVar) {
        ((d0) this.f116959a).b();
        ((d0) this.f116959a).c();
        try {
            ((ja.i) this.f116960b).n(aVar);
            ((d0) this.f116959a).r();
        } finally {
            ((d0) this.f116959a).m();
        }
    }

    public final void j(AttributeSet attributeSet, int i13) {
        TypedArray obtainStyledAttributes = ((EditText) this.f116959a).getContext().obtainStyledAttributes(attributeSet, i.j.AppCompatTextView, i13, 0);
        try {
            boolean z13 = obtainStyledAttributes.hasValue(i.j.AppCompatTextView_emojiCompatEnabled) ? obtainStyledAttributes.getBoolean(i.j.AppCompatTextView_emojiCompatEnabled, true) : true;
            obtainStyledAttributes.recycle();
            ((e3.b) ((j6.b) this.f116960b).f74795c).k(z13);
        } catch (Throwable th3) {
            obtainStyledAttributes.recycle();
            throw th3;
        }
    }

    public final InputConnection l(InputConnection inputConnection, EditorInfo editorInfo) {
        j6.b bVar = (j6.b) this.f116960b;
        if (inputConnection != null) {
            return ((e3.b) bVar.f74795c).g(inputConnection, editorInfo);
        }
        bVar.getClass();
        return null;
    }

    public final synchronized sp2.j m() {
        sp2.j jVar;
        Object obj = this.f116959a;
        jVar = (sp2.j) obj;
        if (((sp2.j) obj) != null) {
            sp2.j jVar2 = ((sp2.j) obj).f114933c;
            this.f116959a = jVar2;
            if (jVar2 == null) {
                this.f116960b = null;
            }
        }
        return jVar;
    }

    public final synchronized sp2.j n() {
        try {
            if (((sp2.j) this.f116959a) == null) {
                wait(1000);
            }
        } catch (Throwable th3) {
            throw th3;
        }
        return m();
    }

    public final void o(boolean z13, boolean z14) {
        if (z13 && ((PowerManager.WakeLock) this.f116960b) == null) {
            PowerManager powerManager = (PowerManager) ((Context) this.f116959a).getSystemService("power");
            if (powerManager == null) {
                d7.u.g("WakeLockManager", "PowerManager is null, therefore not creating the WakeLock.");
                return;
            } else {
                PowerManager.WakeLock newWakeLock = powerManager.newWakeLock(1, "ExoPlayer:WakeLockManager");
                this.f116960b = newWakeLock;
                newWakeLock.setReferenceCounted(false);
            }
        }
        Object obj = this.f116960b;
        if (((PowerManager.WakeLock) obj) == null) {
            return;
        }
        if (z13 && z14) {
            ((PowerManager.WakeLock) obj).acquire();
        } else {
            ((PowerManager.WakeLock) obj).release();
        }
    }

    public final void p(o1 o1Var) {
        Object obj = this.f116959a;
        if (((Handler) obj) != null) {
            ((Handler) obj).post(new e5.k(13, this, o1Var));
        }
    }

    @Override // pm.p
    public final Object u() {
        try {
            return pm.y.f100631a.a((Class) this.f116959a);
        } catch (Exception e13) {
            throw new RuntimeException("Unable to create instance of " + ((Class) this.f116959a) + ". Registering an InstanceCreator or a TypeAdapter for this type, or adding a no-args constructor may fix this problem.", e13);
        }
    }

    public c(IBinder iBinder) {
        String interfaceDescriptor = iBinder.getInterfaceDescriptor();
        if ("android.os.IMessenger".equals(interfaceDescriptor)) {
            this.f116959a = new Messenger(iBinder);
            this.f116960b = null;
        } else if ("com.google.android.gms.iid.IMessengerCompat".equals(interfaceDescriptor)) {
            this.f116960b = new zzd(iBinder);
            this.f116959a = null;
        } else {
            String valueOf = String.valueOf(interfaceDescriptor);
            Log.w("MessengerIpcClient", valueOf.length() != 0 ? "Invalid interface descriptor: ".concat(valueOf) : new String("Invalid interface descriptor: "));
            throw new RemoteException();
        }
    }

    public /* synthetic */ c(Object obj) {
        this.f116959a = obj;
    }

    public /* synthetic */ c(Object obj, Object obj2) {
        this.f116959a = obj;
        this.f116960b = obj2;
    }

    public c(EditText editText) {
        this.f116959a = editText;
        this.f116960b = new j6.b(editText);
    }

    public c(v2 v2Var, int[] iArr) {
        this.f116959a = c1.r(v2Var);
        this.f116960b = iArr;
    }
}
