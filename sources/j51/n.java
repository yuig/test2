package j51;

import android.view.View;
import com.pinterest.feature.profile.savedtab.view.LegoBoardInviteProfileCell;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes5.dex */
public final class n extends kotlin.jvm.internal.s implements Function0 {

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f74760i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ View.OnClickListener f74761j;

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ LegoBoardInviteProfileCell f74762k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ n(g51.a aVar, LegoBoardInviteProfileCell legoBoardInviteProfileCell, int i13) {
        super(0);
        this.f74760i = i13;
        this.f74761j = aVar;
        this.f74762k = legoBoardInviteProfileCell;
    }

    @Override // kotlin.jvm.functions.Function0
    public final /* bridge */ /* synthetic */ Object invoke() {
        switch (this.f74760i) {
            case 0:
                m161invoke();
                break;
            case 1:
                m161invoke();
                break;
            case 2:
                m161invoke();
                break;
            default:
                m161invoke();
                break;
        }
        return Unit.f80348a;
    }

    /* renamed from: invoke, reason: collision with other method in class */
    public final void m161invoke() {
        int i13 = this.f74760i;
        View.OnClickListener onClickListener = this.f74761j;
        LegoBoardInviteProfileCell legoBoardInviteProfileCell = this.f74762k;
        switch (i13) {
            case 0:
                onClickListener.onClick(legoBoardInviteProfileCell.f47589h);
                break;
            case 1:
                onClickListener.onClick(legoBoardInviteProfileCell.f47589h);
                break;
            case 2:
                onClickListener.onClick(legoBoardInviteProfileCell.f47589h);
                break;
            default:
                onClickListener.onClick(legoBoardInviteProfileCell.f47589h);
                break;
        }
    }
}
