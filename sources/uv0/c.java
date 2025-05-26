package uv0;

import android.app.Application;
import android.content.Context;
import android.graphics.Bitmap;
import java.io.File;
import kk2.t;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.s;

/* loaded from: classes5.dex */
public final class c extends s implements Function1 {

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f123158i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ Context f123159j;

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ Application f123160k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ c(Context context, Application application, int i13) {
        super(1);
        this.f123158i = i13;
        this.f123159j = context;
        this.f123160k = application;
    }

    public final t b(Bitmap it) {
        int i13 = this.f123158i;
        Context context = this.f123159j;
        Application application = this.f123160k;
        switch (i13) {
            case 0:
                Intrinsics.checkNotNullParameter(it, "it");
                File dir = application.getDir("story_pin_adjusted_images", 0);
                Intrinsics.checkNotNullExpressionValue(dir, "getDir(...)");
                return kg.a.b0(context, it, dir, "sp_image_adjusted_".concat(cp2.a.a(16)));
            case 1:
                Intrinsics.checkNotNullParameter(it, "it");
                File dir2 = application.getDir("story_pin_adjusted_images", 0);
                Intrinsics.checkNotNullExpressionValue(dir2, "getDir(...)");
                return kg.a.b0(context, it, dir2, "sp_image_adjusted_".concat(cp2.a.a(16)));
            default:
                Intrinsics.checkNotNullParameter(it, "it");
                File dir3 = application.getDir("story_pin_adjusted_images", 0);
                Intrinsics.checkNotNullExpressionValue(dir3, "getDir(...)");
                return kg.a.b0(context, it, dir3, "sp_image_adjusted_".concat(cp2.a.a(16)));
        }
    }

    @Override // kotlin.jvm.functions.Function1
    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        switch (this.f123158i) {
        }
        return b((Bitmap) obj);
    }
}
