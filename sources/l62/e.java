package l62;

import com.pinterest.shuffles.composer.ui.ComposerView;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class e implements p62.c {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ ComposerView f81628a;

    public e(ComposerView composerView) {
        this.f81628a = composerView;
    }

    @Override // p62.c
    public final void B(ke2.d item, int i13) {
        Intrinsics.checkNotNullParameter(item, "item");
        ComposerView composerView = this.f81628a;
        composerView.Y();
        String o13 = com.pinterest.shuffles.scene.composer.y.o(item);
        if (o13 != null) {
            int i14 = h62.n.composer_action_menu_lock;
            b bVar = composerView.f51864v;
            if (i13 == i14) {
                bVar.f(o13);
                return;
            }
            if (i13 == h62.n.composer_action_menu_duplicate) {
                bVar.d(o13);
                return;
            }
            if (i13 == h62.n.composer_action_menu_delete) {
                bVar.c(o13);
            } else if (i13 == h62.n.composer_action_menu_hide) {
                bVar.e(o13);
            } else {
                bVar.b(i13, o13);
            }
        }
    }

    @Override // p62.c
    public final void E(ke2.d item, Integer num) {
        Intrinsics.checkNotNullParameter(item, "item");
        ComposerView composerView = this.f81628a;
        composerView.Y();
        String o13 = com.pinterest.shuffles.scene.composer.y.o(item);
        if (o13 != null) {
            composerView.f51864v.a(num, o13);
        }
    }
}
