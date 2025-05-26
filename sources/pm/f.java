package pm;

import com.google.gson.JsonIOException;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.EnumMap;
import java.util.EnumSet;
import jk2.p2;
import pq2.g0;

/* loaded from: classes3.dex */
public final class f implements p, pq2.k {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f100583a;

    /* renamed from: b, reason: collision with root package name */
    public final Type f100584b;

    public /* synthetic */ f(int i13, Type type) {
        this.f100583a = i13;
        this.f100584b = type;
    }

    @Override // pq2.k
    public /* bridge */ /* synthetic */ Object a(g0 g0Var) {
        switch (this.f100583a) {
        }
        return c(g0Var);
    }

    @Override // pq2.k
    public Type b() {
        return this.f100584b;
    }

    public pq2.m c(g0 g0Var) {
        switch (this.f100583a) {
            case 0:
                pq2.m mVar = new pq2.m(g0Var);
                g0Var.x1(new p2(0, this, mVar));
                return mVar;
            default:
                pq2.m mVar2 = new pq2.m(g0Var);
                g0Var.x1(new p2(1, this, mVar2));
                return mVar2;
        }
    }

    @Override // pm.p
    public Object u() {
        int i13 = this.f100583a;
        Type type = this.f100584b;
        switch (i13) {
            case 0:
                if (!(type instanceof ParameterizedType)) {
                    throw new JsonIOException("Invalid EnumSet type: " + type.toString());
                }
                Type type2 = ((ParameterizedType) type).getActualTypeArguments()[0];
                if (type2 instanceof Class) {
                    return EnumSet.noneOf((Class) type2);
                }
                throw new JsonIOException("Invalid EnumSet type: " + type.toString());
            default:
                if (!(type instanceof ParameterizedType)) {
                    throw new JsonIOException("Invalid EnumMap type: " + type.toString());
                }
                Type type3 = ((ParameterizedType) type).getActualTypeArguments()[0];
                if (type3 instanceof Class) {
                    return new EnumMap((Class) type3);
                }
                throw new JsonIOException("Invalid EnumMap type: " + type.toString());
        }
    }
}
