package l5;

import ac2.v;
import ac2.w;
import android.content.Context;
import android.provider.Settings;
import android.widget.FrameLayout;
import android.widget.ImageView;
import com.airbnb.lottie.LottieAnimationView;
import com.pinterest.ui.imageview.WebImageView;
import h7.t;
import java.io.File;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.s;
import m60.f0;

/* loaded from: classes.dex */
public final class a extends s implements Function0 {

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f81557i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ Context f81558j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ a(Context context, int i13) {
        super(0);
        this.f81557i = i13;
        this.f81558j = context;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        int i13 = this.f81557i;
        Context context = this.f81558j;
        switch (i13) {
            case 0:
                Intrinsics.checkNotNullParameter(context, "<this>");
                Intrinsics.checkNotNullParameter("media_performance_class", "name");
                return bs1.c.P(context, Intrinsics.n(".preferences_pb", "media_performance_class"));
            case 1:
                return Settings.Secure.getString(context.getContentResolver(), "android_id");
            case 2:
                return new je1.a(context);
            case 3:
                WebImageView webImageView = new WebImageView(context);
                webImageView.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
                webImageView.setScaleType(ImageView.ScaleType.CENTER_CROP);
                return webImageView;
            case 4:
                return com.bumptech.glide.b.f(context).d();
            case 5:
                return Boolean.valueOf(dl2.b.T1(context));
            case 6:
                LottieAnimationView lottieAnimationView = new LottieAnimationView(context);
                lottieAnimationView.l2(vc2.e.glow_animation);
                lottieAnimationView.M2(-1);
                lottieAnimationView.setScaleType(ImageView.ScaleType.CENTER_CROP);
                lottieAnimationView.setAlpha(0.6f);
                lottieAnimationView.setVisibility(8);
                return lottieAnimationView;
            case 7:
                return new f7.b(context.getApplicationContext());
            default:
                lb0.e eVar = lb0.e.CACHE_FOLDER_VIDEO;
                Context context2 = kb0.a.f79058b;
                File file = new File(f0.X().getCacheDir(), eVar.getValue());
                if (!file.exists()) {
                    file.mkdir();
                }
                File file2 = new File(file.getPath(), "media_cache");
                if (!file2.exists() || !file2.isDirectory()) {
                    file2.delete();
                    file2.mkdirs();
                }
                t tVar = new t();
                v vVar = w.f2066a;
                Intrinsics.checkNotNullParameter(context, "context");
                return new h7.w(file2, tVar, (f7.b) w.f2068c.a(new a(context, 7)));
        }
    }
}
