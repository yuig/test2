package we1;

import android.content.Context;
import android.view.View;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.pinterest.gestalt.text.GestaltText;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class q extends g {

    /* renamed from: f, reason: collision with root package name */
    public final GestaltText f129557f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q(Context context) {
        super(context);
        Intrinsics.checkNotNullParameter(context, "context");
        View.inflate(context, r82.f.view_cutout_collage_item, this);
        this.f129352c = (ConstraintLayout) findViewById(r82.d.cutout_collage_image_container);
        View findViewById = findViewById(r82.d.cutout_collage_desc);
        Intrinsics.checkNotNullExpressionValue(findViewById, "findViewById(...)");
        this.f129557f = (GestaltText) findViewById;
    }
}
