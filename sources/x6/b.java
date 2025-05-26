package x6;

import android.os.Bundle;
import androidx.lifecycle.l0;
import androidx.lifecycle.m0;
import androidx.lifecycle.z;
import java.io.PrintWriter;

/* loaded from: classes3.dex */
public final class b extends l0 implements y6.c {

    /* renamed from: n, reason: collision with root package name */
    public final y6.b f133917n;

    /* renamed from: o, reason: collision with root package name */
    public z f133918o;

    /* renamed from: p, reason: collision with root package name */
    public c f133919p;

    /* renamed from: l, reason: collision with root package name */
    public final int f133915l = 0;

    /* renamed from: m, reason: collision with root package name */
    public final Bundle f133916m = null;

    /* renamed from: q, reason: collision with root package name */
    public y6.b f133920q = null;

    public b(fh.d dVar) {
        this.f133917n = dVar;
        if (dVar.f137898b != null) {
            throw new IllegalStateException("There is already a listener registered");
        }
        dVar.f137898b = this;
        dVar.f137897a = 0;
    }

    @Override // androidx.lifecycle.h0
    public final void g() {
        y6.b bVar = this.f133917n;
        bVar.f137899c = true;
        bVar.f137901e = false;
        bVar.f137900d = false;
        fh.d dVar = (fh.d) bVar;
        dVar.f62138j.drainPermits();
        dVar.c();
    }

    @Override // androidx.lifecycle.h0
    public final void h() {
        this.f133917n.f137899c = false;
    }

    @Override // androidx.lifecycle.h0
    public final void j(m0 m0Var) {
        super.j(m0Var);
        this.f133918o = null;
        this.f133919p = null;
    }

    @Override // androidx.lifecycle.l0, androidx.lifecycle.h0
    public final void k(Object obj) {
        super.k(obj);
        y6.b bVar = this.f133920q;
        if (bVar != null) {
            bVar.f137901e = true;
            bVar.f137899c = false;
            bVar.f137900d = false;
            bVar.f137902f = false;
            this.f133920q = null;
        }
    }

    public final void l(String str, PrintWriter printWriter) {
        printWriter.print(str);
        printWriter.print("mId=");
        printWriter.print(this.f133915l);
        printWriter.print(" mArgs=");
        printWriter.println(this.f133916m);
        printWriter.print(str);
        printWriter.print("mLoader=");
        printWriter.println(this.f133917n);
        y6.b bVar = this.f133917n;
        String str2 = str + "  ";
        bVar.getClass();
        printWriter.print(str2);
        printWriter.print("mId=");
        printWriter.print(bVar.f137897a);
        printWriter.print(" mListener=");
        printWriter.println(bVar.f137898b);
        if (bVar.f137899c || bVar.f137902f) {
            printWriter.print(str2);
            printWriter.print("mStarted=");
            printWriter.print(bVar.f137899c);
            printWriter.print(" mContentChanged=");
            printWriter.print(bVar.f137902f);
            printWriter.print(" mProcessingChange=");
            printWriter.println(false);
        }
        if (bVar.f137900d || bVar.f137901e) {
            printWriter.print(str2);
            printWriter.print("mAbandoned=");
            printWriter.print(bVar.f137900d);
            printWriter.print(" mReset=");
            printWriter.println(bVar.f137901e);
        }
        if (bVar.f137904h != null) {
            printWriter.print(str2);
            printWriter.print("mTask=");
            printWriter.print(bVar.f137904h);
            printWriter.print(" waiting=");
            bVar.f137904h.getClass();
            printWriter.println(false);
        }
        if (bVar.f137905i != null) {
            printWriter.print(str2);
            printWriter.print("mCancellingTask=");
            printWriter.print(bVar.f137905i);
            printWriter.print(" waiting=");
            bVar.f137905i.getClass();
            printWriter.println(false);
        }
        if (this.f133919p != null) {
            printWriter.print(str);
            printWriter.print("mCallbacks=");
            printWriter.println(this.f133919p);
            c cVar = this.f133919p;
            cVar.getClass();
            printWriter.print(str + "  ");
            printWriter.print("mDeliveredData=");
            printWriter.println(cVar.f133922b);
        }
        printWriter.print(str);
        printWriter.print("mData=");
        y6.b bVar2 = this.f133917n;
        Object d2 = d();
        bVar2.getClass();
        StringBuilder sb3 = new StringBuilder(64);
        if (d2 == null) {
            sb3.append("null");
        } else {
            Class<?> cls = d2.getClass();
            sb3.append(cls.getSimpleName());
            sb3.append("{");
            sb3.append(Integer.toHexString(System.identityHashCode(cls)));
            sb3.append("}");
        }
        printWriter.println(sb3.toString());
        printWriter.print(str);
        printWriter.print("mStarted=");
        printWriter.println(this.f18633c > 0);
    }

    public final void m() {
        z zVar = this.f133918o;
        c cVar = this.f133919p;
        if (zVar == null || cVar == null) {
            return;
        }
        super.j(cVar);
        e(zVar, cVar);
    }

    public final String toString() {
        StringBuilder sb3 = new StringBuilder(64);
        sb3.append("LoaderInfo{");
        sb3.append(Integer.toHexString(System.identityHashCode(this)));
        sb3.append(" #");
        sb3.append(this.f133915l);
        sb3.append(" : ");
        Class<?> cls = this.f133917n.getClass();
        sb3.append(cls.getSimpleName());
        sb3.append("{");
        sb3.append(Integer.toHexString(System.identityHashCode(cls)));
        sb3.append("}}");
        return sb3.toString();
    }
}
