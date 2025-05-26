package l72;

import g72.g3;
import g72.n;
import g72.n1;
import g72.o;
import g72.u4;
import g72.v1;
import java.util.HashMap;
import kotlin.Unit;
import kotlin.collections.h1;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.k0;
import kotlin.jvm.internal.l0;
import kotlin.jvm.internal.s;
import no2.b;
import rl2.d;
import ro2.i;
import to2.e;

/* loaded from: classes4.dex */
public final class a extends s implements Function1 {

    /* renamed from: j, reason: collision with root package name */
    public static final a f81980j = new a(0);

    /* renamed from: k, reason: collision with root package name */
    public static final a f81981k = new a(1);

    /* renamed from: l, reason: collision with root package name */
    public static final a f81982l = new a(2);

    /* renamed from: m, reason: collision with root package name */
    public static final a f81983m = new a(3);

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f81984i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ a(int i13) {
        super(1);
        this.f81984i = i13;
    }

    public final b b() {
        switch (this.f81984i) {
            case 0:
                return n.INSTANCE.serializer();
            case 1:
                return g3.INSTANCE.serializer();
            default:
                return n1.INSTANCE.serializer();
        }
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.f81984i) {
            case 0:
                return b();
            case 1:
                return b();
            case 2:
                return b();
            default:
                i Json = (i) obj;
                Intrinsics.checkNotNullParameter(Json, "$this$Json");
                Json.f108995c = true;
                Json.f109000h = true;
                e eVar = new e();
                HashMap hashMap = new HashMap();
                HashMap hashMap2 = new HashMap();
                HashMap hashMap3 = new HashMap();
                HashMap hashMap4 = new HashMap();
                HashMap hashMap5 = new HashMap();
                l0 l0Var = k0.f80436a;
                d baseClass = l0Var.b(o.class);
                a defaultDeserializerProvider = f81980j;
                Intrinsics.checkNotNullParameter(baseClass, "baseClass");
                Intrinsics.checkNotNullParameter(defaultDeserializerProvider, "defaultDeserializerProvider");
                Intrinsics.checkNotNullParameter(baseClass, "baseClass");
                Intrinsics.checkNotNullParameter(defaultDeserializerProvider, "defaultDeserializerProvider");
                Function1 function1 = (Function1) hashMap5.get(baseClass);
                if (function1 != null && !Intrinsics.d(function1, defaultDeserializerProvider)) {
                    throw new IllegalArgumentException("Default deserializers provider for " + baseClass + " is already registered: " + function1);
                }
                hashMap5.put(baseClass, defaultDeserializerProvider);
                Unit unit = Unit.f80348a;
                to2.d dVar = new to2.d(hashMap, hashMap2, hashMap3, hashMap4, hashMap5);
                HashMap hashMap6 = new HashMap();
                HashMap hashMap7 = new HashMap();
                HashMap hashMap8 = new HashMap();
                HashMap hashMap9 = new HashMap();
                HashMap hashMap10 = new HashMap();
                d baseClass2 = l0Var.b(u4.class);
                a defaultDeserializerProvider2 = f81981k;
                Intrinsics.checkNotNullParameter(baseClass2, "baseClass");
                Intrinsics.checkNotNullParameter(defaultDeserializerProvider2, "defaultDeserializerProvider");
                Intrinsics.checkNotNullParameter(baseClass2, "baseClass");
                Intrinsics.checkNotNullParameter(defaultDeserializerProvider2, "defaultDeserializerProvider");
                Function1 function12 = (Function1) hashMap10.get(baseClass2);
                if (function12 != null && !Intrinsics.d(function12, defaultDeserializerProvider2)) {
                    throw new IllegalArgumentException("Default deserializers provider for " + baseClass2 + " is already registered: " + function12);
                }
                hashMap10.put(baseClass2, defaultDeserializerProvider2);
                to2.d dVar2 = new to2.d(hashMap6, hashMap7, hashMap8, hashMap9, hashMap10);
                HashMap hashMap11 = new HashMap();
                HashMap hashMap12 = new HashMap();
                HashMap hashMap13 = new HashMap();
                HashMap hashMap14 = new HashMap();
                HashMap hashMap15 = new HashMap();
                d baseClass3 = l0Var.b(v1.class);
                a defaultDeserializerProvider3 = f81982l;
                Intrinsics.checkNotNullParameter(baseClass3, "baseClass");
                Intrinsics.checkNotNullParameter(defaultDeserializerProvider3, "defaultDeserializerProvider");
                Intrinsics.checkNotNullParameter(baseClass3, "baseClass");
                Intrinsics.checkNotNullParameter(defaultDeserializerProvider3, "defaultDeserializerProvider");
                Function1 function13 = (Function1) hashMap15.get(baseClass3);
                if (function13 != null && !Intrinsics.d(function13, defaultDeserializerProvider3)) {
                    throw new IllegalArgumentException("Default deserializers provider for " + baseClass3 + " is already registered: " + function13);
                }
                hashMap15.put(baseClass3, defaultDeserializerProvider3);
                for (to2.d module : h1.f(dVar, dVar2, new to2.d(hashMap11, hashMap12, hashMap13, hashMap14, hashMap15))) {
                    Intrinsics.checkNotNullParameter(module, "module");
                    module.a(eVar);
                }
                to2.d dVar3 = new to2.d(eVar.f118711a, eVar.f118712b, eVar.f118713c, eVar.f118714d, eVar.f118715e);
                Intrinsics.checkNotNullParameter(dVar3, "<set-?>");
                Json.f109008p = dVar3;
                return Unit.f80348a;
        }
    }
}
