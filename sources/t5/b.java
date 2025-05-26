package t5;

import android.os.Bundle;
import android.view.inputmethod.InputConnection;
import android.view.inputmethod.InputConnectionWrapper;
import android.view.inputmethod.InputContentInfo;

/* loaded from: classes3.dex */
public final class b extends InputConnectionWrapper {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ c f116421a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ b(InputConnection inputConnection, c cVar) {
        super(inputConnection, false);
        this.f116421a = cVar;
    }

    @Override // android.view.inputmethod.InputConnectionWrapper, android.view.inputmethod.InputConnection
    public final boolean commitContent(InputContentInfo inputContentInfo, int i13, Bundle bundle) {
        if (this.f116421a.q(inputContentInfo == null ? null : new e(new gc.c(inputContentInfo), 0), i13, bundle)) {
            return true;
        }
        return super.commitContent(inputContentInfo, i13, bundle);
    }

    @Override // android.view.inputmethod.InputConnectionWrapper, android.view.inputmethod.InputConnection
    public final boolean performPrivateCommand(String str, Bundle bundle) {
        return super.performPrivateCommand(str, bundle);
    }
}
