package vy;

import com.pinterest.feature.core.view.RecyclerViewTypes;
import java.util.ArrayList;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.s;

/* loaded from: classes.dex */
public final class d extends s implements Function0 {

    /* renamed from: j, reason: collision with root package name */
    public static final d f126848j = new d(0);

    /* renamed from: k, reason: collision with root package name */
    public static final d f126849k = new d(1);

    /* renamed from: l, reason: collision with root package name */
    public static final d f126850l = new d(2);

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f126851i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ d(int i13) {
        super(0);
        this.f126851i = i13;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        int i13 = this.f126851i;
        switch (i13) {
            case 0:
                nm.p pVar = new nm.p();
                int[] iArr = {RecyclerViewTypes.VIEW_TYPE_ONE_TAP_SAVE_PIN_FEEDBACK_FULL_SPAN};
                pm.h clone = pVar.f91344a.clone();
                clone.f100593b = iArr[0];
                pVar.f91344a = clone;
                break;
            case 1:
                switch (i13) {
                }
            default:
                switch (i13) {
                }
        }
        return new ArrayList();
    }
}
