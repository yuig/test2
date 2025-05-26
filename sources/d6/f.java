package d6;

import a6.j0;
import a6.l;
import androidx.datastore.core.CorruptionException;
import androidx.datastore.preferences.protobuf.InvalidProtocolBufferException;
import androidx.datastore.preferences.protobuf.g0;
import androidx.datastore.preferences.protobuf.i0;
import androidx.datastore.preferences.protobuf.p;
import androidx.datastore.preferences.protobuf.q;
import ao2.v0;
import java.io.FileInputStream;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.logging.Logger;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.e0;
import kotlin.collections.q0;
import kotlin.collections.z0;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class f implements l {

    /* renamed from: a, reason: collision with root package name */
    public static final f f53733a = new f();

    public static d a(b6.a aVar, List migrations, Function0 produceFile, int i13) {
        a6.a aVar2 = aVar;
        if ((i13 & 1) != 0) {
            aVar2 = null;
        }
        if ((i13 & 2) != 0) {
            migrations = q0.f80391a;
        }
        ko2.f fVar = v0.f20219a;
        ho2.c scope = dl2.b.b(ko2.e.f80326c.plus(ue.c.b()));
        Intrinsics.checkNotNullParameter(migrations, "migrations");
        Intrinsics.checkNotNullParameter(scope, "scope");
        Intrinsics.checkNotNullParameter(produceFile, "produceFile");
        f serializer = f53733a;
        e produceFile2 = new e(0, produceFile);
        Intrinsics.checkNotNullParameter(serializer, "serializer");
        Intrinsics.checkNotNullParameter(migrations, "migrations");
        Intrinsics.checkNotNullParameter(scope, "scope");
        Intrinsics.checkNotNullParameter(produceFile2, "produceFile");
        a6.a aVar3 = aVar2;
        if (aVar2 == null) {
            aVar3 = new bk.f();
        }
        a6.a aVar4 = aVar3;
        Intrinsics.checkNotNullParameter(migrations, "migrations");
        return new d(new j0(produceFile2, serializer, e0.b(new a6.c(migrations, null)), aVar4, scope));
    }

    @Override // a6.l
    public Object getDefaultValue() {
        return new b(true);
    }

    @Override // a6.l
    public Object readFrom(InputStream input, bl2.c cVar) {
        Intrinsics.checkNotNullParameter(input, "input");
        try {
            c6.d m13 = c6.d.m((FileInputStream) input);
            Intrinsics.checkNotNullExpressionValue(m13, "{\n                PreferencesProto.PreferenceMap.parseFrom(input)\n            }");
            h[] pairs = new h[0];
            Intrinsics.checkNotNullParameter(pairs, "pairs");
            b bVar = new b(false);
            h[] pairs2 = (h[]) Arrays.copyOf(pairs, 0);
            Intrinsics.checkNotNullParameter(pairs2, "pairs");
            bVar.a();
            if (pairs2.length > 0) {
                h hVar = pairs2[0];
                throw null;
            }
            Map k13 = m13.k();
            Intrinsics.checkNotNullExpressionValue(k13, "preferencesProto.preferencesMap");
            for (Map.Entry entry : k13.entrySet()) {
                String name = (String) entry.getKey();
                c6.i value = (c6.i) entry.getValue();
                Intrinsics.checkNotNullExpressionValue(name, "name");
                Intrinsics.checkNotNullExpressionValue(value, "value");
                c6.h y13 = value.y();
                switch (y13 == null ? -1 : k.f53738a[y13.ordinal()]) {
                    case -1:
                        throw new CorruptionException("Value case is null.");
                    case 0:
                    default:
                        throw new NoWhenBranchMatchedException();
                    case 1:
                        Intrinsics.checkNotNullParameter(name, "name");
                        g key = new g(name);
                        Boolean valueOf = Boolean.valueOf(value.q());
                        Intrinsics.checkNotNullParameter(key, "key");
                        bVar.c(key, valueOf);
                        break;
                    case 2:
                        Intrinsics.checkNotNullParameter(name, "name");
                        g key2 = new g(name);
                        Float valueOf2 = Float.valueOf(value.t());
                        Intrinsics.checkNotNullParameter(key2, "key");
                        bVar.c(key2, valueOf2);
                        break;
                    case 3:
                        Intrinsics.checkNotNullParameter(name, "name");
                        g key3 = new g(name);
                        Double valueOf3 = Double.valueOf(value.s());
                        Intrinsics.checkNotNullParameter(key3, "key");
                        bVar.c(key3, valueOf3);
                        break;
                    case 4:
                        g key4 = d7.b.c0(name);
                        Integer valueOf4 = Integer.valueOf(value.u());
                        Intrinsics.checkNotNullParameter(key4, "key");
                        bVar.c(key4, valueOf4);
                        break;
                    case 5:
                        Intrinsics.checkNotNullParameter(name, "name");
                        g key5 = new g(name);
                        Long valueOf5 = Long.valueOf(value.v());
                        Intrinsics.checkNotNullParameter(key5, "key");
                        bVar.c(key5, valueOf5);
                        break;
                    case 6:
                        g key6 = d7.b.z0(name);
                        String w13 = value.w();
                        Intrinsics.checkNotNullExpressionValue(w13, "value.string");
                        Intrinsics.checkNotNullParameter(key6, "key");
                        bVar.c(key6, w13);
                        break;
                    case 7:
                        Intrinsics.checkNotNullParameter(name, "name");
                        g key7 = new g(name);
                        i0 m14 = value.x().m();
                        Intrinsics.checkNotNullExpressionValue(m14, "value.stringSet.stringsList");
                        Set J0 = CollectionsKt.J0(m14);
                        Intrinsics.checkNotNullParameter(key7, "key");
                        bVar.c(key7, J0);
                        break;
                    case 8:
                        throw new CorruptionException("Value not set.");
                }
            }
            Map unmodifiableMap = Collections.unmodifiableMap(bVar.f53725a);
            Intrinsics.checkNotNullExpressionValue(unmodifiableMap, "unmodifiableMap(preferencesMap)");
            return new b(z0.r(unmodifiableMap), true);
        } catch (InvalidProtocolBufferException e13) {
            Intrinsics.checkNotNullParameter("Unable to parse preferences proto.", "message");
            throw new CorruptionException("Unable to parse preferences proto.", e13);
        }
    }

    @Override // a6.l
    public Object writeTo(Object obj, OutputStream outputStream, bl2.c cVar) {
        g0 c13;
        Map unmodifiableMap = Collections.unmodifiableMap(((b) ((i) obj)).f53725a);
        Intrinsics.checkNotNullExpressionValue(unmodifiableMap, "unmodifiableMap(preferencesMap)");
        c6.b l13 = c6.d.l();
        for (Map.Entry entry : unmodifiableMap.entrySet()) {
            g gVar = (g) entry.getKey();
            Object value = entry.getValue();
            String str = gVar.f53734a;
            if (value instanceof Boolean) {
                c6.g z13 = c6.i.z();
                z13.k(((Boolean) value).booleanValue());
                c13 = z13.c();
                Intrinsics.checkNotNullExpressionValue(c13, "newBuilder().setBoolean(value).build()");
            } else if (value instanceof Float) {
                c6.g z14 = c6.i.z();
                z14.m(((Number) value).floatValue());
                c13 = z14.c();
                Intrinsics.checkNotNullExpressionValue(c13, "newBuilder().setFloat(value).build()");
            } else if (value instanceof Double) {
                c6.g z15 = c6.i.z();
                z15.l(((Number) value).doubleValue());
                c13 = z15.c();
                Intrinsics.checkNotNullExpressionValue(c13, "newBuilder().setDouble(value).build()");
            } else if (value instanceof Integer) {
                c6.g z16 = c6.i.z();
                int intValue = ((Number) value).intValue();
                z16.h();
                c6.i.p((c6.i) z16.f18056b, intValue);
                c13 = z16.c();
                Intrinsics.checkNotNullExpressionValue(c13, "newBuilder().setInteger(value).build()");
            } else if (value instanceof Long) {
                c6.g z17 = c6.i.z();
                z17.n(((Number) value).longValue());
                c13 = z17.c();
                Intrinsics.checkNotNullExpressionValue(c13, "newBuilder().setLong(value).build()");
            } else if (value instanceof String) {
                c6.g z18 = c6.i.z();
                z18.o((String) value);
                c13 = z18.c();
                Intrinsics.checkNotNullExpressionValue(c13, "newBuilder().setString(value).build()");
            } else {
                if (!(value instanceof Set)) {
                    throw new IllegalStateException(Intrinsics.n(value.getClass().getName(), "PreferencesSerializer does not support type: "));
                }
                c6.g z19 = c6.i.z();
                c6.e n13 = c6.f.n();
                n13.k((Set) value);
                z19.p(n13);
                c13 = z19.c();
                Intrinsics.checkNotNullExpressionValue(c13, "newBuilder().setStringSet(\n                    StringSet.newBuilder().addAllStrings(value as Set<String>)\n                ).build()");
            }
            l13.getClass();
            str.getClass();
            l13.h();
            c6.d.j((c6.d) l13.f18056b).put(str, (c6.i) c13);
        }
        c6.d dVar = (c6.d) l13.c();
        int a13 = dVar.a();
        Logger logger = q.f18129d;
        if (a13 > 4096) {
            a13 = 4096;
        }
        p pVar = new p((a6.q) outputStream, a13);
        dVar.c(pVar);
        if (pVar.f18120h > 0) {
            pVar.s0();
        }
        return Unit.f80348a;
    }
}
