package i80;

import ao2.j0;
import com.pinterest.api.adapter.coroutine.NetworkResponse;
import com.pinterest.api.model.cn;
import dl2.j;
import h80.d;
import h80.n;
import h80.q;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import u50.r;

/* loaded from: classes5.dex */
public final class a extends j implements Function2 {

    /* renamed from: r, reason: collision with root package name */
    public long f71712r;

    /* renamed from: s, reason: collision with root package name */
    public int f71713s;

    /* renamed from: t, reason: collision with root package name */
    public /* synthetic */ Object f71714t;

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ b f71715u;

    /* renamed from: v, reason: collision with root package name */
    public final /* synthetic */ q f71716v;

    /* renamed from: w, reason: collision with root package name */
    public final /* synthetic */ r f71717w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(b bVar, q qVar, r rVar, bl2.c cVar) {
        super(2, cVar);
        this.f71715u = bVar;
        this.f71716v = qVar;
        this.f71717w = rVar;
    }

    @Override // dl2.a
    public final bl2.c create(Object obj, bl2.c cVar) {
        a aVar = new a(this.f71715u, this.f71716v, this.f71717w, cVar);
        aVar.f71714t = obj;
        return aVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((a) create((j0) obj, (bl2.c) obj2)).invokeSuspend(Unit.f80348a);
    }

    @Override // dl2.a
    public final Object invokeSuspend(Object obj) {
        long j13;
        Unit unit;
        String j14;
        cl2.a aVar = cl2.a.COROUTINE_SUSPENDED;
        int i13 = this.f71713s;
        q qVar = this.f71716v;
        if (i13 == 0) {
            ue.c.H(obj);
            j0 j0Var = (j0) this.f71714t;
            long currentTimeMillis = System.currentTimeMillis();
            g20.a aVar2 = this.f71715u.f71719b;
            n nVar = (n) qVar;
            String lowerCase = nVar.f68109b.toLowerCase(Locale.ROOT);
            Intrinsics.checkNotNullExpressionValue(lowerCase, "toLowerCase(...)");
            String str = nVar.f68108a;
            this.f71714t = j0Var;
            this.f71712r = currentTimeMillis;
            this.f71713s = 1;
            obj = aVar2.b(lowerCase, str, this);
            if (obj == aVar) {
                return aVar;
            }
            j13 = currentTimeMillis;
        } else {
            if (i13 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            j13 = this.f71712r;
            ue.c.H(obj);
        }
        NetworkResponse networkResponse = (NetworkResponse) obj;
        HashMap hashMap = new HashMap();
        hashMap.put("style_name", ((n) qVar).f68109b);
        hashMap.put("time_in_ms", String.valueOf(System.currentTimeMillis() - j13));
        boolean z13 = networkResponse instanceof xz.b;
        r rVar = this.f71717w;
        if (z13) {
            cn cnVar = (cn) CollectionsKt.firstOrNull((List) ((xz.b) networkResponse).f136205a);
            if (cnVar == null || (j14 = cnVar.j()) == null) {
                unit = null;
            } else {
                String c03 = StringsKt.c0(j14, "/");
                hashMap.put("image_signature", StringsKt.f0(c03, ".jpg", c03));
                rVar.a(new h80.c(j14, hashMap));
                unit = Unit.f80348a;
            }
            if (unit == null) {
                rVar.a(new d(hashMap));
            }
        } else if (networkResponse instanceof xz.a) {
            rVar.a(new d(hashMap));
        }
        return Unit.f80348a;
    }
}
