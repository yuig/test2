package y52;

import android.net.Uri;
import android.widget.VideoView;
import com.pinterest.gestalt.text.GestaltText;
import com.pinterest.ui.imageview.WebImageView;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class p0 extends dl2.j implements Function2 {

    /* renamed from: r, reason: collision with root package name */
    public /* synthetic */ Object f137834r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ x0 f137835s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p0(x0 x0Var, bl2.c cVar) {
        super(2, cVar);
        this.f137835s = x0Var;
    }

    @Override // dl2.a
    public final bl2.c create(Object obj, bl2.c cVar) {
        p0 p0Var = new p0(this.f137835s, cVar);
        p0Var.f137834r = obj;
        return p0Var;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((p0) create((e) obj, (bl2.c) obj2)).invokeSuspend(Unit.f80348a);
    }

    @Override // dl2.a
    public final Object invokeSuspend(Object obj) {
        cl2.a aVar = cl2.a.COROUTINE_SUSPENDED;
        ue.c.H(obj);
        e eVar = (e) this.f137834r;
        x0 x0Var = this.f137835s;
        Object value = x0Var.f137872h0.getValue();
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        pk.a0.p((GestaltText) value, eVar.f137792a);
        boolean booleanValue = ((Boolean) x0Var.f137877m0.getValue()).booleanValue();
        String str = eVar.f137793b;
        if (booleanValue) {
            VideoView videoView = x0Var.f137880p0;
            if (videoView == null) {
                Intrinsics.r("videoView");
                throw null;
            }
            bs1.c.X0(videoView);
            WebImageView webImageView = x0Var.f137881q0;
            if (webImageView == null) {
                Intrinsics.r("imageView");
                throw null;
            }
            bs1.c.U1(webImageView);
            WebImageView webImageView2 = x0Var.f137881q0;
            if (webImageView2 == null) {
                Intrinsics.r("imageView");
                throw null;
            }
            webImageView2.setImageURI(Uri.parse(str));
        } else {
            VideoView videoView2 = x0Var.f137880p0;
            if (videoView2 == null) {
                Intrinsics.r("videoView");
                throw null;
            }
            if (!videoView2.isPlaying()) {
                Uri parse = Uri.parse(str);
                VideoView videoView3 = x0Var.f137880p0;
                if (videoView3 == null) {
                    Intrinsics.r("videoView");
                    throw null;
                }
                videoView3.setVideoURI(parse);
                VideoView videoView4 = x0Var.f137880p0;
                if (videoView4 == null) {
                    Intrinsics.r("videoView");
                    throw null;
                }
                videoView4.setOnPreparedListener(new l0());
                VideoView videoView5 = x0Var.f137880p0;
                if (videoView5 == null) {
                    Intrinsics.r("videoView");
                    throw null;
                }
                videoView5.start();
            }
        }
        return Unit.f80348a;
    }
}
