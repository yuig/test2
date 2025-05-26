package xm2;

import ao2.m0;
import java.io.ByteArrayInputStream;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Pair;
import kotlin.collections.CollectionsKt;
import kotlin.collections.f0;
import kotlin.collections.g0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException;
import kotlin.reflect.jvm.internal.impl.protobuf.UninitializedMessageException;
import lb.l0;
import tm2.a0;
import tm2.a1;
import tm2.e0;
import tm2.i0;
import tm2.m;
import tm2.s0;
import wm2.l;
import zm2.k;
import zm2.s;
import zm2.t;

/* loaded from: classes2.dex */
public final class j {

    /* renamed from: a, reason: collision with root package name */
    public static final k f135411a;

    static {
        k kVar = new k();
        kVar.a(l.f130414a);
        kVar.a(l.f130415b);
        kVar.a(l.f130416c);
        kVar.a(l.f130417d);
        kVar.a(l.f130418e);
        kVar.a(l.f130419f);
        kVar.a(l.f130420g);
        kVar.a(l.f130421h);
        kVar.a(l.f130422i);
        kVar.a(l.f130423j);
        kVar.a(l.f130424k);
        kVar.a(l.f130425l);
        kVar.a(l.f130426m);
        kVar.a(l.f130427n);
        Intrinsics.checkNotNullExpressionValue(kVar, "apply(...)");
        f135411a = kVar;
    }

    public static e a(m proto, vm2.f nameResolver, vm2.i typeTable) {
        String Z;
        Intrinsics.checkNotNullParameter(proto, "proto");
        Intrinsics.checkNotNullParameter(nameResolver, "nameResolver");
        Intrinsics.checkNotNullParameter(typeTable, "typeTable");
        s constructorSignature = l.f130414a;
        Intrinsics.checkNotNullExpressionValue(constructorSignature, "constructorSignature");
        wm2.d dVar = (wm2.d) m0.w(proto, constructorSignature);
        String c13 = (dVar == null || (dVar.f130360b & 1) != 1) ? "<init>" : nameResolver.c(dVar.f130361c);
        if (dVar == null || (dVar.f130360b & 2) != 2) {
            List list = proto.f118391e;
            Intrinsics.checkNotNullExpressionValue(list, "getValueParameterList(...)");
            List<a1> list2 = list;
            ArrayList arrayList = new ArrayList(g0.q(list2, 10));
            for (a1 a1Var : list2) {
                Intrinsics.f(a1Var);
                String e13 = e(l0.B1(a1Var, typeTable), nameResolver);
                if (e13 == null) {
                    return null;
                }
                arrayList.add(e13);
            }
            Z = CollectionsKt.Z(arrayList, "", "(", ")V", 0, null, null, 56);
        } else {
            Z = nameResolver.c(dVar.f130362d);
        }
        return new e(c13, Z);
    }

    public static d b(i0 proto, vm2.f nameResolver, vm2.i typeTable, boolean z13) {
        String e13;
        Intrinsics.checkNotNullParameter(proto, "proto");
        Intrinsics.checkNotNullParameter(nameResolver, "nameResolver");
        Intrinsics.checkNotNullParameter(typeTable, "typeTable");
        s propertySignature = l.f130417d;
        Intrinsics.checkNotNullExpressionValue(propertySignature, "propertySignature");
        wm2.f fVar = (wm2.f) m0.w(proto, propertySignature);
        if (fVar == null) {
            return null;
        }
        wm2.b bVar = (fVar.f130374b & 1) == 1 ? fVar.f130375c : null;
        if (bVar == null && z13) {
            return null;
        }
        int i13 = (bVar == null || (bVar.f130349b & 1) != 1) ? proto.f118328f : bVar.f130350c;
        if (bVar == null || (bVar.f130349b & 2) != 2) {
            e13 = e(l0.g1(proto, typeTable), nameResolver);
            if (e13 == null) {
                return null;
            }
        } else {
            e13 = nameResolver.c(bVar.f130351d);
        }
        return new d(nameResolver.c(i13), e13);
    }

    public static e c(a0 proto, vm2.f nameResolver, vm2.i typeTable) {
        String p13;
        Intrinsics.checkNotNullParameter(proto, "proto");
        Intrinsics.checkNotNullParameter(nameResolver, "nameResolver");
        Intrinsics.checkNotNullParameter(typeTable, "typeTable");
        s methodSignature = l.f130415b;
        Intrinsics.checkNotNullExpressionValue(methodSignature, "methodSignature");
        wm2.d dVar = (wm2.d) m0.w(proto, methodSignature);
        int i13 = (dVar == null || (dVar.f130360b & 1) != 1) ? proto.f118148f : dVar.f130361c;
        if (dVar == null || (dVar.f130360b & 2) != 2) {
            List k13 = f0.k(l0.V0(proto, typeTable));
            List list = proto.f118157o;
            Intrinsics.checkNotNullExpressionValue(list, "getValueParameterList(...)");
            List<a1> list2 = list;
            ArrayList arrayList = new ArrayList(g0.q(list2, 10));
            for (a1 a1Var : list2) {
                Intrinsics.f(a1Var);
                arrayList.add(l0.B1(a1Var, typeTable));
            }
            ArrayList l03 = CollectionsKt.l0(arrayList, k13);
            ArrayList arrayList2 = new ArrayList(g0.q(l03, 10));
            Iterator it = l03.iterator();
            while (it.hasNext()) {
                String e13 = e((s0) it.next(), nameResolver);
                if (e13 == null) {
                    return null;
                }
                arrayList2.add(e13);
            }
            String e14 = e(l0.f1(proto, typeTable), nameResolver);
            if (e14 == null) {
                return null;
            }
            p13 = a.a.p(new StringBuilder(), CollectionsKt.Z(arrayList2, "", "(", ")", 0, null, null, 56), e14);
        } else {
            p13 = nameResolver.c(dVar.f130362d);
        }
        return new e(nameResolver.c(i13), p13);
    }

    public static final boolean d(i0 proto) {
        Intrinsics.checkNotNullParameter(proto, "proto");
        vm2.b a13 = c.a();
        Object j13 = proto.j(l.f130418e);
        Intrinsics.checkNotNullExpressionValue(j13, "getExtension(...)");
        Boolean c13 = a13.c(((Number) j13).intValue());
        Intrinsics.checkNotNullExpressionValue(c13, "get(...)");
        return c13.booleanValue();
    }

    public static String e(s0 s0Var, vm2.f fVar) {
        if (s0Var.v()) {
            return b.b(fVar.b(s0Var.f118459i));
        }
        return null;
    }

    public static final Pair f(String[] data, String[] strings) {
        Intrinsics.checkNotNullParameter(data, "data");
        Intrinsics.checkNotNullParameter(strings, "strings");
        byte[] bytes = a.d(data);
        Intrinsics.checkNotNullExpressionValue(bytes, "decodeBytes(...)");
        Intrinsics.checkNotNullParameter(bytes, "bytes");
        Intrinsics.checkNotNullParameter(strings, "strings");
        ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(bytes);
        h g13 = g(byteArrayInputStream, strings);
        tm2.a aVar = tm2.k.K;
        aVar.getClass();
        zm2.h hVar = new zm2.h(byteArrayInputStream);
        t a13 = aVar.a(hVar, f135411a);
        try {
            if (hVar.f142213f != 0) {
                throw InvalidProtocolBufferException.a();
            }
            if (a13.isInitialized()) {
                return new Pair(g13, (tm2.k) a13);
            }
            InvalidProtocolBufferException invalidProtocolBufferException = new InvalidProtocolBufferException(new UninitializedMessageException().getMessage());
            invalidProtocolBufferException.f80460a = a13;
            throw invalidProtocolBufferException;
        } catch (InvalidProtocolBufferException e13) {
            e13.f80460a = a13;
            throw e13;
        }
    }

    public static h g(ByteArrayInputStream byteArrayInputStream, String[] strArr) {
        wm2.k kVar = (wm2.k) wm2.k.f130407h.b(byteArrayInputStream, f135411a);
        Intrinsics.checkNotNullExpressionValue(kVar, "parseDelimitedFrom(...)");
        return new h(kVar, strArr);
    }

    public static final Pair h(String[] data, String[] strings) {
        Intrinsics.checkNotNullParameter(data, "data");
        Intrinsics.checkNotNullParameter(strings, "strings");
        byte[] bytes = a.d(data);
        Intrinsics.checkNotNullExpressionValue(bytes, "decodeBytes(...)");
        Intrinsics.checkNotNullParameter(bytes, "bytes");
        Intrinsics.checkNotNullParameter(strings, "strings");
        ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(bytes);
        h g13 = g(byteArrayInputStream, strings);
        tm2.a aVar = e0.f118222l;
        aVar.getClass();
        zm2.h hVar = new zm2.h(byteArrayInputStream);
        t a13 = aVar.a(hVar, f135411a);
        try {
            if (hVar.f142213f != 0) {
                throw InvalidProtocolBufferException.a();
            }
            if (a13.isInitialized()) {
                return new Pair(g13, (e0) a13);
            }
            InvalidProtocolBufferException invalidProtocolBufferException = new InvalidProtocolBufferException(new UninitializedMessageException().getMessage());
            invalidProtocolBufferException.f80460a = a13;
            throw invalidProtocolBufferException;
        } catch (InvalidProtocolBufferException e13) {
            e13.f80460a = a13;
            throw e13;
        }
    }
}
