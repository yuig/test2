package sl1;

import android.content.Context;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.widget.LinearLayout;
import androidx.appcompat.widget.AppCompatTextView;
import com.pinterest.gestalt.avatargroup.GestaltAvatarGroup;
import kh2.j1;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class j extends AppCompatTextView {

    /* renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int f113184a = 0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j(Context context) {
        super(context, null);
        Intrinsics.checkNotNullParameter(context, "context");
        int dimensionPixelSize = getResources().getDimensionPixelSize(eo1.c.lego_grid_cell_indicator_padding);
        dl2.b.A2(this);
        j1.q1(this, eo1.c.font_size_100);
        int i13 = eo1.b.color_themed_text_default;
        Object obj = d5.a.f53679a;
        setTextColor(context.getColor(i13));
        setMaxLines(1);
        setEllipsize(TextUtils.TruncateAt.END);
        setGravity(17);
        setBackground(context.getDrawable(mk1.a.capsule_transparent_white_bg));
        setPaddingRelative(dimensionPixelSize, dimensionPixelSize, dimensionPixelSize, dimensionPixelSize);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j(GestaltAvatarGroup gestaltAvatarGroup, int i13, int i14, int i15, Typeface typeface, p91.v event, LinearLayout.LayoutParams layoutParams, int i16, Drawable drawable, fm1.c visibility) {
        super(gestaltAvatarGroup.getContext(), null);
        String valueOf;
        Intrinsics.checkNotNullParameter(event, "event");
        Intrinsics.checkNotNullParameter(layoutParams, "layoutParams");
        Intrinsics.checkNotNullParameter(visibility, "visibility");
        if (i13 > 99) {
            valueOf = "99+";
        } else {
            valueOf = String.valueOf(i13);
        }
        setLayoutParams(layoutParams);
        setGravity(17);
        setMinHeight(i16);
        setMaxHeight(i16);
        setMinWidth(i16);
        setMaxWidth(i16);
        setVisibility(visibility.getVisibility());
        setBackground(drawable);
        setText(valueOf);
        setTypeface(typeface);
        setEllipsize(TextUtils.TruncateAt.END);
        setTextSize(0, i14 * (1.0f - ((valueOf.length() - 1) * 0.1f)));
        setTextColor(i15);
        setOnClickListener(new fd1.e(13, gestaltAvatarGroup, event));
        setOnLongClickListener(new sp.d(6, gestaltAvatarGroup, event));
    }
}
