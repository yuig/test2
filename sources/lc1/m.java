package lc1;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import com.pinterest.gestalt.listAction.GestaltListAction;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class m extends LinearLayout implements yk1.n {

    /* renamed from: c, reason: collision with root package name */
    public static final /* synthetic */ int f82895c = 0;

    /* renamed from: a, reason: collision with root package name */
    public final jc1.g f82896a;

    /* renamed from: b, reason: collision with root package name */
    public final GestaltListAction f82897b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m(Context context, jc1.g listener) {
        super(context);
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(listener, "listener");
        this.f82896a = listener;
        setLayoutParams(new LinearLayout.LayoutParams(-1, -2));
        View inflate = LayoutInflater.from(context).inflate(j52.b.view_edit_profile_text_view_menu_item, (ViewGroup) this, true);
        View findViewById = inflate.findViewById(j52.a.edit_profile_list_action);
        Intrinsics.checkNotNullExpressionValue(findViewById, "findViewById(...)");
        this.f82897b = (GestaltListAction) findViewById;
        inflate.setOnClickListener(new b(this, 1));
    }
}
