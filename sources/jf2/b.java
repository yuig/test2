package jf2;

import androidx.recyclerview.widget.c3;
import ja.d0;

/* loaded from: classes4.dex */
public final class b extends c3 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f75871d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ b(d0 d0Var, int i13) {
        super(d0Var);
        this.f75871d = i13;
    }

    @Override // androidx.recyclerview.widget.c3
    public final String e() {
        switch (this.f75871d) {
            case 0:
                return "DELETE FROM MqMessageEntity WHERE clientHandle = ? AND messageId = ?";
            default:
                return "DELETE FROM MqMessageEntity WHERE clientHandle = ?";
        }
    }
}
