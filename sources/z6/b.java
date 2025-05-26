package z6;

import android.content.BroadcastReceiver;
import android.content.IntentFilter;
import com.pinterest.feature.core.view.RecyclerViewTypes;

/* loaded from: classes.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    public final IntentFilter f140876a;

    /* renamed from: b, reason: collision with root package name */
    public final BroadcastReceiver f140877b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f140878c;

    /* renamed from: d, reason: collision with root package name */
    public boolean f140879d;

    public b(BroadcastReceiver broadcastReceiver, IntentFilter intentFilter) {
        this.f140876a = intentFilter;
        this.f140877b = broadcastReceiver;
    }

    public final String toString() {
        StringBuilder sb3 = new StringBuilder(RecyclerViewTypes.VIEW_TYPE_ONE_TAP_SAVE_PIN_FEEDBACK_FULL_SPAN);
        sb3.append("Receiver{");
        sb3.append(this.f140877b);
        sb3.append(" filter=");
        sb3.append(this.f140876a);
        if (this.f140879d) {
            sb3.append(" DEAD");
        }
        sb3.append("}");
        return sb3.toString();
    }
}
