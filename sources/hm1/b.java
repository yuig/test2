package hm1;

import android.content.Context;
import android.util.AttributeSet;
import com.pinterest.gestalt.avatar.GestaltAvatar;
import com.pinterest.gestalt.iconcomponent.GestaltIcon;
import fc0.k;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.s;

/* loaded from: classes5.dex */
public final class b extends s implements Function1 {

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f69574i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ int f69575j;

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ gm1.a f69576k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ b(int i13, gm1.a aVar, int i14) {
        super(1);
        this.f69574i = i14;
        this.f69575j = i13;
        this.f69576k = aVar;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        int i13 = this.f69574i;
        gm1.a eventHandler = this.f69576k;
        int i14 = this.f69575j;
        switch (i13) {
            case 0:
                Context context = (Context) obj;
                Intrinsics.checkNotNullParameter(context, "context");
                GestaltAvatar gestaltAvatar = new GestaltAvatar(6, k.a(context, i14), (AttributeSet) null);
                if (eventHandler != null) {
                    gestaltAvatar.M2(eventHandler);
                }
                return gestaltAvatar;
            default:
                Context context2 = (Context) obj;
                Intrinsics.checkNotNullParameter(context2, "context");
                GestaltIcon gestaltIcon = new GestaltIcon(k.a(context2, i14));
                if (eventHandler != null) {
                    Intrinsics.checkNotNullParameter(eventHandler, "eventHandler");
                }
                return gestaltIcon;
        }
    }
}
