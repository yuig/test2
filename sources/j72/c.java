package j72;

import android.graphics.Bitmap;
import ao2.j0;
import c72.u;
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

/* loaded from: classes4.dex */
public final class c extends dl2.j implements Function2 {

    /* renamed from: r, reason: collision with root package name */
    public int f74855r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ d f74856s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ f2 f74857t;

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ Bitmap f74858u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(d dVar, f2 f2Var, Bitmap bitmap, bl2.c cVar) {
        super(2, cVar);
        this.f74856s = dVar;
        this.f74857t = f2Var;
        this.f74858u = bitmap;
    }

    @Override // dl2.a
    public final bl2.c create(Object obj, bl2.c cVar) {
        return new c(this.f74856s, this.f74857t, this.f74858u, cVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((c) create((j0) obj, (bl2.c) obj2)).invokeSuspend(Unit.f80348a);
    }

    @Override // dl2.a
    public final Object invokeSuspend(Object obj) {
        cl2.a aVar = cl2.a.COROUTINE_SUSPENDED;
        int i13 = this.f74855r;
        d dVar = this.f74856s;
        if (i13 == 0) {
            ue.c.H(obj);
            ro2.b bVar = ro2.c.f108975d;
            u uVar = dVar.f74861c;
            f2 f2Var = this.f74857t;
            q1 b13 = uVar.b(f2Var);
            bVar.getClass();
            String b14 = bVar.b(q1.Companion.serializer(), b13);
            RequestBody.f95711a.getClass();
            MultipartBody.Part part = null;
            RequestBody$Companion$toRequestBody$2 a13 = RequestBody.Companion.a(b14, null);
            RequestBody$Companion$toRequestBody$2 a14 = d.a(dVar, this.f74858u);
            if (a14 != null) {
                Intrinsics.checkNotNullParameter(a14, "<this>");
                MultipartBody.Part.f95670c.getClass();
                part = MultipartBody.Part.Companion.b("image", "myphoto", a14);
            }
            this.f74855r = 1;
            obj = dVar.f74859a.c(f2Var.f106469a, a13, part, this);
            if (obj == aVar) {
                return aVar;
            }
        } else {
            if (i13 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ue.c.H(obj);
        }
        m1 shuffle = dVar.f74860b.a((x) ((d72.c) obj).f53913c);
        dVar.f74862d.getClass();
        Intrinsics.checkNotNullParameter(shuffle, "shuffle");
        return shuffle;
    }
}
