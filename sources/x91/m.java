package x91;

import android.content.Context;
import android.util.AttributeSet;
import com.pinterest.gestalt.text.GestaltText;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class m extends kotlin.jvm.internal.s implements Function0 {

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f134342i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ s f134343j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ m(s sVar, int i13) {
        super(0);
        this.f134342i = i13;
        this.f134343j = sVar;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        int i13 = this.f134342i;
        s sVar = this.f134343j;
        switch (i13) {
            case 0:
                Context requireContext = sVar.requireContext();
                Intrinsics.checkNotNullExpressionValue(requireContext, "requireContext(...)");
                GestaltText gestaltText = new GestaltText(6, requireContext, (AttributeSet) null);
                pp2.a.k(gestaltText, l.f134331j);
                return gestaltText;
            default:
                Context requireContext2 = sVar.requireContext();
                Intrinsics.checkNotNullExpressionValue(requireContext2, "requireContext(...)");
                return new defpackage.c(requireContext2);
        }
    }
}
