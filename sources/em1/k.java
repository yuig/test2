package em1;

import android.app.Application;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.os.StatFs;
import android.util.AttributeSet;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import com.pinterest.gestalt.divider.GestaltDivider;
import com.pinterest.gestalt.iconbutton.GestaltIconButton;
import h7.t;
import h7.w;
import java.io.File;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.s;
import m60.f0;

/* loaded from: classes5.dex */
public final class k extends s implements Function0 {

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f59630i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ Context f59631j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ k(Context context, int i13) {
        super(0);
        this.f59630i = i13;
        this.f59631j = context;
    }

    public final Drawable b() {
        int i13 = this.f59630i;
        Context context = this.f59631j;
        switch (i13) {
            case 0:
                return bs1.c.c0(context, dl2.b.a1(context, eo1.a.comp_checkbox_disabled_indeterminate_icon));
            case 1:
                return bs1.c.c0(context, o.ic_checkbox_unchecked_gestalt_disabled);
            case 2:
                return bs1.c.c0(context, dl2.b.a1(context, eo1.a.comp_checkbox_selected_icon));
            case 3:
                return bs1.c.c0(context, dl2.b.a1(context, eo1.a.comp_checkbox_indeterminate_icon));
            case 4:
                return bs1.c.c0(context, o.ic_checkbox_unchecked_gestalt);
            case 5:
                return bs1.c.c0(context, dl2.b.a1(context, eo1.a.comp_checkbox_error_selected_icon));
            case 6:
                return bs1.c.c0(context, dl2.b.a1(context, eo1.a.comp_checkbox_error_indeterminate_icon));
            default:
                return bs1.c.c0(context, o.ic_checkbox_unchecked_gestalt_error);
        }
    }

    public final LinearLayout e() {
        int i13 = this.f59630i;
        Context context = this.f59631j;
        switch (i13) {
            case 8:
                LinearLayout linearLayout = new LinearLayout(context);
                linearLayout.setOrientation(0);
                linearLayout.setGravity(16);
                linearLayout.setClipToPadding(false);
                linearLayout.setId(le0.d.bar_actions);
                return linearLayout;
            default:
                LinearLayout linearLayout2 = new LinearLayout(context);
                linearLayout2.setOrientation(0);
                linearLayout2.setGravity(16);
                linearLayout2.setClipToPadding(false);
                linearLayout2.setId(le0.d.bar_icons);
                return linearLayout2;
        }
    }

    public final Float f() {
        int i13 = this.f59630i;
        Context context = this.f59631j;
        switch (i13) {
            case 12:
                return Float.valueOf(kg.a.g0(8, context));
            case 13:
                return Float.valueOf(kg.a.g0(32, context));
            default:
                return Float.valueOf(context.getResources().getDisplayMetrics().density * 24);
        }
    }

    public final GestaltIconButton h() {
        int i13 = this.f59630i;
        int i14 = 6;
        AttributeSet attributeSet = null;
        Context context = this.f59631j;
        switch (i13) {
            case 19:
                return new GestaltIconButton(i14, context, attributeSet).t(ec2.c.f58439j);
            default:
                return new GestaltIconButton(i14, context, attributeSet).t(ec2.c.f58440k);
        }
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        int i13 = this.f59630i;
        Context context = this.f59631j;
        switch (i13) {
            case 0:
                return b();
            case 1:
                return b();
            case 2:
                return b();
            case 3:
                return b();
            case 4:
                return b();
            case 5:
                return b();
            case 6:
                return b();
            case 7:
                return b();
            case 8:
                return e();
            case 9:
                return e();
            case 10:
                return new tq.s(context, 3);
            case 11:
                return new uw1.e(context);
            case 12:
                return f();
            case 13:
                return f();
            case 14:
                return f();
            case 15:
                switch (i13) {
                    case 15:
                        return Integer.valueOf(context.getResources().getDimensionPixelSize(vc2.a.visual_search_cropper_edge_size));
                    default:
                        return Integer.valueOf(context.getResources().getDimensionPixelSize(vc2.a.visual_search_cropper_handle_size));
                }
            case 16:
                switch (i13) {
                    case 15:
                        return Integer.valueOf(context.getResources().getDimensionPixelSize(vc2.a.visual_search_cropper_edge_size));
                    default:
                        return Integer.valueOf(context.getResources().getDimensionPixelSize(vc2.a.visual_search_cropper_handle_size));
                }
            case 17:
                lb0.e eVar = lb0.e.CACHE_FOLDER_VIDEO;
                Context context2 = kb0.a.f79058b;
                File file = new File(f0.X().getCacheDir(), eVar.getValue());
                if (!file.exists()) {
                    file.mkdir();
                }
                File file2 = new File(file.getPath(), "media_cache_offline");
                if (!file2.exists() || !file2.isDirectory()) {
                    file2.delete();
                    file2.mkdirs();
                }
                return new w(file2, new t(), new f7.b(context.getApplicationContext()));
            case 18:
                GestaltDivider gestaltDivider = new GestaltDivider(6, context, (AttributeSet) null);
                gestaltDivider.setLayoutParams(new FrameLayout.LayoutParams(-1, gestaltDivider.getResources().getDimensionPixelSize(eo1.c.space_600)));
                gestaltDivider.setImportantForAccessibility(2);
                return gestaltDivider;
            case 19:
                return h();
            case 20:
                return h();
            case 21:
                return context instanceof Application ? context : context.getApplicationContext();
            default:
                return new StatFs(context.getFilesDir().getPath());
        }
    }
}
