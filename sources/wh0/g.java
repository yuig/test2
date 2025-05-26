package wh0;

import android.content.Context;
import android.view.View;
import android.widget.LinearLayout;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public abstract class g extends LinearLayout {

    /* renamed from: d, reason: collision with root package name */
    public static final /* synthetic */ int f129908d = 0;

    /* renamed from: a, reason: collision with root package name */
    public final sh0.c f129909a;

    /* renamed from: b, reason: collision with root package name */
    public final View.OnClickListener f129910b;

    /* renamed from: c, reason: collision with root package name */
    public final View.OnClickListener f129911c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(Context context, sh0.c question, th0.a onNextClickListener, th0.a aVar) {
        super(context);
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(question, "question");
        Intrinsics.checkNotNullParameter(onNextClickListener, "onNextClickListener");
        this.f129909a = question;
        this.f129910b = onNextClickListener;
        this.f129911c = aVar;
    }
}
