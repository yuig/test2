package zp;

import android.content.Context;
import android.os.Bundle;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.pinterest.gestalt.textfield.view.GestaltTextField;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public abstract class c extends ConstraintLayout {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(Context context) {
        super(context);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    public abstract void L();

    public abstract void T();

    public abstract GestaltTextField X();

    public abstract GestaltTextField Z();

    public abstract void a0(Bundle bundle);

    public abstract void d0();

    public abstract boolean g0();
}
