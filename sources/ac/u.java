package ac;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.util.Base64;
import ao2.j0;
import java.io.IOException;
import java.io.InputStream;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import kotlin.text.z;

/* loaded from: classes3.dex */
public final class u extends dl2.j implements Function2 {

    /* renamed from: r, reason: collision with root package name */
    public final /* synthetic */ com.airbnb.lottie.h f1887r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ Context f1888s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ String f1889t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u(Context context, com.airbnb.lottie.h hVar, String str, bl2.c cVar) {
        super(2, cVar);
        this.f1887r = hVar;
        this.f1888s = context;
        this.f1889t = str;
    }

    @Override // dl2.a
    public final bl2.c create(Object obj, bl2.c cVar) {
        return new u(this.f1888s, this.f1887r, this.f1889t, cVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((u) create((j0) obj, (bl2.c) obj2)).invokeSuspend(Unit.f80348a);
    }

    @Override // dl2.a
    public final Object invokeSuspend(Object obj) {
        String str;
        cl2.a aVar = cl2.a.COROUTINE_SUSPENDED;
        ue.c.H(obj);
        for (com.airbnb.lottie.w wVar : this.f1887r.c().values()) {
            Intrinsics.f(wVar);
            Bitmap bitmap = wVar.f28477f;
            String str2 = wVar.f28475d;
            if (bitmap == null) {
                Intrinsics.f(str2);
                if (z.p(str2, "data:", false) && StringsKt.L(str2, "base64,", 0, false, 6) > 0) {
                    try {
                        String substring = str2.substring(StringsKt.K(str2, ',', 0, false, 6) + 1);
                        Intrinsics.checkNotNullExpressionValue(substring, "substring(...)");
                        byte[] decode = Base64.decode(substring, 0);
                        BitmapFactory.Options options = new BitmapFactory.Options();
                        options.inScaled = true;
                        options.inDensity = 160;
                        wVar.f28477f = BitmapFactory.decodeByteArray(decode, 0, decode.length, options);
                    } catch (IllegalArgumentException e13) {
                        jc.b.d("data URL did not have correct base64 format.", e13);
                    }
                }
            }
            Context context = this.f1888s;
            if (wVar.f28477f == null && (str = this.f1889t) != null) {
                try {
                    InputStream open = context.getAssets().open(str + str2);
                    Intrinsics.f(open);
                    try {
                        BitmapFactory.Options options2 = new BitmapFactory.Options();
                        options2.inScaled = true;
                        options2.inDensity = 160;
                        wVar.f28477f = jc.g.e(BitmapFactory.decodeStream(open, null, options2), wVar.f28472a, wVar.f28473b);
                    } catch (IllegalArgumentException e14) {
                        jc.b.d("Unable to decode image.", e14);
                    }
                } catch (IOException e15) {
                    jc.b.d("Unable to open asset.", e15);
                }
            }
        }
        return Unit.f80348a;
    }
}
