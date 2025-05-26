package np;

import android.content.Context;
import android.content.Intent;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.view.View;
import android.view.animation.AnimationUtils;
import android.widget.ImageButton;
import com.pinterest.activity.create.CameraActivity;
import java.io.File;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final class c implements View.OnClickListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f91680a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ CameraActivity f91681b;

    public /* synthetic */ c(CameraActivity cameraActivity, int i13) {
        this.f91680a = i13;
        this.f91681b = cameraActivity;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        Drawable drawable;
        Drawable drawable2;
        int i13 = this.f91680a;
        CameraActivity cameraActivity = this.f91681b;
        switch (i13) {
            case 0:
                kg.n.a(view);
                cameraActivity.B();
                break;
            case 1:
                kg.n.a(view);
                if (fa2.c.b()) {
                    int i14 = cameraActivity.f34909t + 1;
                    cameraActivity.f34909t = i14;
                    fa2.c.l(cameraActivity.f34903n, i14, false);
                    fa2.c.l(cameraActivity.f34906q, cameraActivity.f34909t, false);
                    ImageButton imageButton = cameraActivity.f34903n;
                    CameraActivity.y(cameraActivity, imageButton, imageButton.getDrawable());
                    break;
                }
                break;
            case 2:
                kg.n.a(view);
                File file = cameraActivity.f34913x;
                if (file != null) {
                    Uri fromFile = Uri.fromFile(file);
                    cameraActivity.f34915z.b("PREF_CAMERA_PHOTO_STATE_PATH", "");
                    Intent intent = new Intent();
                    intent.putExtra("com.pinterest.EXTRA_CREATE_MEDIA_URI", fromFile.toString());
                    cameraActivity.setResult(-1, intent);
                    cameraActivity.finish();
                    break;
                }
                break;
            case 3:
                kg.n.a(view);
                cameraActivity.f34895f.clearAnimation();
                cameraActivity.f34895f.setVisibility(0);
                cameraActivity.f34895f.startAnimation(AnimationUtils.loadAnimation(cameraActivity, ry1.a.anim_scale_and_fade_in));
                cameraActivity.f34898i.setVisibility(8);
                break;
            case 4:
                kg.n.a(view);
                if (CameraActivity.K) {
                    int i15 = ry1.b.ic_grid_off_nonpds;
                    Object obj = d5.a.f53679a;
                    drawable = cameraActivity.getDrawable(i15);
                    cameraActivity.f34894e.setVisibility(8);
                } else {
                    int i16 = ry1.b.ic_grid_on_nonpds;
                    Object obj2 = d5.a.f53679a;
                    drawable = cameraActivity.getDrawable(i16);
                    cameraActivity.f34894e.setVisibility(0);
                }
                CameraActivity.K = !CameraActivity.K;
                ImageButton imageButton2 = cameraActivity.f34902m;
                Context context = imageButton2.getContext();
                int i17 = eo1.b.color_white_0;
                Intrinsics.checkNotNullParameter(context, "context");
                if (drawable != null) {
                    int color = i17 == 0 ? context.getColor(df0.a.f54892a) : context.getColor(i17);
                    Intrinsics.checkNotNullParameter(context, "context");
                    if (color == 0) {
                        color = context.getColor(df0.a.f54892a);
                    }
                    drawable2 = drawable.mutate();
                    drawable2.setTint(color);
                } else {
                    drawable2 = null;
                }
                CameraActivity.y(cameraActivity, imageButton2, drawable2);
                break;
            case 5:
                kg.n.a(view);
                int i18 = CameraActivity.f34890J;
                cameraActivity.z();
                break;
            default:
                kg.n.a(view);
                if (CameraActivity.f34890J == 0) {
                    CameraActivity.f34890J = 1;
                } else {
                    CameraActivity.f34890J = 0;
                }
                cameraActivity.A(CameraActivity.f34890J, eo1.a.color_white_mochimalist_0_opacity_80);
                ImageButton imageButton3 = cameraActivity.f34901l;
                CameraActivity.y(cameraActivity, imageButton3, imageButton3.getDrawable());
                fa2.b bVar = new fa2.b(cameraActivity, CameraActivity.f34890J, cameraActivity.f34891b, cameraActivity.B);
                cameraActivity.f34908s = bVar;
                bVar.execute(new Void[0]);
                break;
        }
    }
}
