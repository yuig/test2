package va1;

import com.pinterest.framework.screens.ScreenLocation;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes5.dex */
public abstract class f1 extends j1 implements e, h {

    /* renamed from: e, reason: collision with root package name */
    public final rm1.q f125175e;

    public /* synthetic */ f1(Integer num, String str, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this(num, (i13 & 2) != 0 ? null : str);
    }

    @Override // va1.e
    public final rm1.q g() {
        return this.f125175e;
    }

    public abstract ScreenLocation j();

    public f1(Integer num, String str) {
        super(num, str);
        this.f125175e = rm1.q.ARROW_FORWARD;
    }
}
