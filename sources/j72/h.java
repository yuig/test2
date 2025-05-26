package j72;

import android.graphics.Bitmap;
import android.net.Uri;
import ao2.j0;
import ao2.v0;
import c72.u;
import c72.v;
import f72.m0;
import java.io.ByteArrayOutputStream;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import okhttp3.MultipartBody;
import okhttp3.RequestBody;
import okhttp3.RequestBody$Companion$toRequestBody$2;
import r72.b1;
import r72.c1;
import r72.u1;
import r72.w1;

/* loaded from: classes4.dex */
public final class h extends dl2.j implements Function2 {

    /* renamed from: r, reason: collision with root package name */
    public Uri f74870r;

    /* renamed from: s, reason: collision with root package name */
    public int f74871s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ s f74872t;

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ u1 f74873u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(s sVar, u1 u1Var, bl2.c cVar) {
        super(2, cVar);
        this.f74872t = sVar;
        this.f74873u = u1Var;
    }

    @Override // dl2.a
    public final bl2.c create(Object obj, bl2.c cVar) {
        return new h(this.f74872t, this.f74873u, cVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((h) create((j0) obj, (bl2.c) obj2)).invokeSuspend(Unit.f80348a);
    }

    @Override // dl2.a
    public final Object invokeSuspend(Object obj) {
        Uri parse;
        int i13;
        cl2.a aVar = cl2.a.COROUTINE_SUSPENDED;
        int i14 = this.f74871s;
        u1 u1Var = this.f74873u;
        s sVar = this.f74872t;
        if (i14 == 0) {
            ue.c.H(obj);
            sVar.f74911d.b("ImageUrl used in generateItemImageId: " + u1Var.f106687s.f106716a, n72.l.VERBOSE);
            parse = Uri.parse(u1Var.f106687s.f106716a);
            ko2.f fVar = v0.f20219a;
            ko2.e eVar = ko2.e.f80326c;
            g gVar = new g(sVar, parse, null);
            this.f74870r = parse;
            this.f74871s = 1;
            obj = kotlin.jvm.internal.j.M(this, eVar, gVar);
            if (obj == aVar) {
                return aVar;
            }
        } else {
            if (i14 != 1) {
                if (i14 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ue.c.H(obj);
                m0 m0Var = (m0) ((d72.c) obj).f53913c;
                String value = m0Var.f61308a;
                int i15 = c1.f106451a;
                Intrinsics.checkNotNullParameter(value, "value");
                return new b1(value, m0Var.f61317j);
            }
            parse = this.f74870r;
            ue.c.H(obj);
        }
        Bitmap bitmap = (Bitmap) obj;
        u uVar = sVar.f74912e;
        w1 from = u1Var.f106678j;
        uVar.getClass();
        Intrinsics.checkNotNullParameter(from, "from");
        int i16 = v.f26929a[from.ordinal()];
        if (i16 == 1) {
            i13 = 1;
        } else if (i16 != 2) {
            i13 = 3;
            if (i16 != 3) {
                i13 = 4;
                if (i16 != 4) {
                    i13 = -1;
                }
            }
        } else {
            i13 = 2;
        }
        Integer num = new Integer(i13);
        if (num.intValue() == -1) {
            num = null;
        }
        int intValue = num != null ? num.intValue() : 1;
        String lastPathSegment = parse.getLastPathSegment();
        if (lastPathSegment == null) {
            lastPathSegment = "nil";
        }
        String str = lastPathSegment;
        String valueOf = String.valueOf(intValue);
        RequestBody.Companion companion = RequestBody.f95711a;
        Intrinsics.f(bitmap);
        Intrinsics.checkNotNullParameter(bitmap, "<this>");
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        bitmap.compress(Bitmap.CompressFormat.PNG, 100, byteArrayOutputStream);
        byte[] byteArray = byteArrayOutputStream.toByteArray();
        Intrinsics.checkNotNullExpressionValue(byteArray, "toByteArray(...)");
        RequestBody$Companion$toRequestBody$2 e13 = RequestBody.Companion.e(companion, byteArray, null, 7);
        Intrinsics.checkNotNullParameter(e13, "<this>");
        MultipartBody.Part.f95670c.getClass();
        MultipartBody.Part b13 = MultipartBody.Part.Companion.b("image", "myphoto", e13);
        this.f74870r = null;
        this.f74871s = 2;
        obj = sVar.f74909b.a(str, valueOf, "0", null, b13, this);
        if (obj == aVar) {
            return aVar;
        }
        m0 m0Var2 = (m0) ((d72.c) obj).f53913c;
        String value2 = m0Var2.f61308a;
        int i152 = c1.f106451a;
        Intrinsics.checkNotNullParameter(value2, "value");
        return new b1(value2, m0Var2.f61317j);
    }
}
