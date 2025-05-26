package lc1;

import android.content.Context;
import android.view.View;
import android.widget.LinearLayout;
import androidx.recyclerview.widget.RecyclerView;
import com.pinterest.gestalt.avatar.GestaltAvatar;
import com.pinterest.gestalt.button.view.GestaltButton;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class h extends LinearLayout implements yk1.n {

    /* renamed from: a, reason: collision with root package name */
    public final Function0 f82874a;

    /* renamed from: b, reason: collision with root package name */
    public final GestaltAvatar f82875b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(Context context, hc1.m updatePictureAction) {
        super(context);
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(updatePictureAction, "updatePictureAction");
        this.f82874a = updatePictureAction;
        setLayoutParams(new RecyclerView.LayoutParams(-1, -2));
        View.inflate(context, j52.b.view_edit_profile_avatar, this);
        View findViewById = findViewById(j52.a.edit_profile_avatar_view_picture);
        Intrinsics.checkNotNullExpressionValue(findViewById, "findViewById(...)");
        this.f82875b = (GestaltAvatar) findViewById;
        ((GestaltButton) findViewById(j52.a.edit_avatar_button)).d(g.f82864j).e(new f(this, 0));
    }
}
