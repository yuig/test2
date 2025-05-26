package j72;

import android.graphics.Bitmap;
import ao2.j0;
import f72.q1;
import f72.x;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import okhttp3.MultipartBody;
import okhttp3.RequestBody;
import okhttp3.RequestBody$Companion$toRequestBody$2;
import r72.f2;
import r72.m1;
import r72.x0;

/* loaded from: classes4.dex */
public final class a extends dl2.j implements Function2 {

    /* renamed from: r, reason: collision with root package name */
    public int f74847r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ d f74848s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ f2 f74849t;

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ Bitmap f74850u;

    /* renamed from: v, reason: collision with root package name */
    public final /* synthetic */ x0 f74851v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(d dVar, f2 f2Var, Bitmap bitmap, x0 x0Var, bl2.c cVar) {
        super(2, cVar);
        this.f74848s = dVar;
        this.f74849t = f2Var;
        this.f74850u = bitmap;
        this.f74851v = x0Var;
    }

    @Override // dl2.a
    public final bl2.c create(Object obj, bl2.c cVar) {
        return new a(this.f74848s, this.f74849t, this.f74850u, this.f74851v, cVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((a) create((j0) obj, (bl2.c) obj2)).invokeSuspend(Unit.f80348a);
    }

    @Override // dl2.a
    public final Object invokeSuspend(Object obj) {
        Object a13;
        m1 shuffle;
        cl2.a aVar = cl2.a.COROUTINE_SUSPENDED;
        int i13 = this.f74847r;
        d dVar = this.f74848s;
        if (i13 == 0) {
            ue.c.H(obj);
            ro2.b bVar = ro2.c.f108975d;
            q1 b13 = dVar.f74861c.b(this.f74849t);
            bVar.getClass();
            String b14 = bVar.b(q1.Companion.serializer(), b13);
            RequestBody.f95711a.getClass();
            MultipartBody.Part part = null;
            RequestBody$Companion$toRequestBody$2 a14 = RequestBody.Companion.a(b14, null);
            RequestBody$Companion$toRequestBody$2 a15 = d.a(dVar, this.f74850u);
            if (a15 != null) {
                Intrinsics.checkNotNullParameter(a15, "<this>");
                MultipartBody.Part.f95670c.getClass();
                part = MultipartBody.Part.Companion.b("image", "myphoto", a15);
            }
            this.f74847r = 1;
            a13 = dVar.f74859a.a(a14, part, this);
            if (a13 == aVar) {
                return aVar;
            }
        } else {
            if (i13 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ue.c.H(obj);
            a13 = obj;
        }
        m1 a16 = dVar.f74860b.a((x) ((d72.c) a13).f53913c);
        x0 image = this.f74851v;
        if (image != null) {
            String id3 = a16.f106551a;
            Intrinsics.checkNotNullParameter(id3, "id");
            Intrinsics.checkNotNullParameter(image, "image");
            String type = a16.f106561k;
            Intrinsics.checkNotNullParameter(type, "type");
            String postedAt = a16.f106565o;
            Intrinsics.checkNotNullParameter(postedAt, "postedAt");
            p72.a user = a16.f106569s;
            Intrinsics.checkNotNullParameter(user, "user");
            r72.q1 shuffleEffectData = a16.f106570t;
            Intrinsics.checkNotNullParameter(shuffleEffectData, "shuffleEffectData");
            shuffle = new m1(id3, a16.f106552b, image, a16.f106554d, a16.f106555e, a16.f106556f, a16.f106557g, a16.f106558h, a16.f106559i, a16.f106560j, type, a16.f106562l, a16.f106563m, a16.f106564n, postedAt, a16.f106566p, a16.f106567q, a16.f106568r, user, shuffleEffectData, a16.f106571u, a16.f106572v, a16.f106573w, a16.f106574x, a16.f106575y);
        } else {
            shuffle = a16;
        }
        dVar.f74862d.getClass();
        Intrinsics.checkNotNullParameter(shuffle, "shuffle");
        return a16;
    }
}
