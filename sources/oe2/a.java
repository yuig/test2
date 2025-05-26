package oe2;

import com.squareup.moshi.JsonDataException;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Type;
import java.util.Set;

/* loaded from: classes4.dex */
public final class a extends r {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ d f94274a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ r f94275b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ h0 f94276c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ d f94277d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Set f94278e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ Type f94279f;

    public a(d dVar, r rVar, h0 h0Var, d dVar2, Set set, Type type) {
        this.f94274a = dVar;
        this.f94275b = rVar;
        this.f94276c = h0Var;
        this.f94277d = dVar2;
        this.f94278e = set;
        this.f94279f = type;
    }

    @Override // oe2.r
    public final Object a(v vVar) {
        d dVar = this.f94277d;
        if (dVar == null) {
            return this.f94275b.a(vVar);
        }
        if (!dVar.f94308g && vVar.g() == u.NULL) {
            vVar.B1();
            return null;
        }
        try {
            return dVar.b(vVar);
        } catch (InvocationTargetException e13) {
            Throwable cause = e13.getCause();
            if (cause instanceof IOException) {
                throw ((IOException) cause);
            }
            throw new JsonDataException(cause + " at " + vVar.f(), cause);
        }
    }

    @Override // oe2.r
    public final void d(y yVar, Object obj) {
        d dVar = this.f94274a;
        if (dVar == null) {
            this.f94275b.d(yVar, obj);
            return;
        }
        if (!dVar.f94308g && obj == null) {
            yVar.g();
            return;
        }
        try {
            dVar.d(this.f94276c, yVar, obj);
        } catch (InvocationTargetException e13) {
            Throwable cause = e13.getCause();
            if (cause instanceof IOException) {
                throw ((IOException) cause);
            }
            throw new JsonDataException(cause + " at " + yVar.e(), cause);
        }
    }

    public final String toString() {
        return "JsonAdapter" + this.f94278e + "(" + this.f94279f + ")";
    }
}
