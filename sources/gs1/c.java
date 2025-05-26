package gs1;

import android.content.ClipData;
import android.content.ClipDescription;
import android.content.ClipboardManager;
import java.util.Optional;
import java.util.concurrent.Callable;
import uj2.b0;

/* loaded from: classes4.dex */
public final /* synthetic */ class c implements Callable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f66078a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ d f66079b;

    public /* synthetic */ c(d dVar, int i13) {
        this.f66078a = i13;
        this.f66079b = dVar;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        int i13 = this.f66078a;
        ClipDescription clipDescription = null;
        clipDescription = null;
        d dVar = this.f66079b;
        dVar.getClass();
        switch (i13) {
            case 0:
                String str = "";
                try {
                    ClipboardManager clipboardManager = dVar.f66080a;
                    ClipData primaryClip = clipboardManager != null ? clipboardManager.getPrimaryClip() : null;
                    if (primaryClip != null && primaryClip.getItemCount() > 0) {
                        ClipData.Item itemAt = primaryClip.getItemAt(0);
                        CharSequence text = itemAt != null ? itemAt.getText() : null;
                        if (text != null) {
                            str = text.toString();
                        }
                    }
                } catch (Exception unused) {
                }
                return b0.j(str);
            default:
                try {
                    ClipboardManager clipboardManager2 = dVar.f66080a;
                    if (clipboardManager2 != null) {
                        clipDescription = clipboardManager2.getPrimaryClipDescription();
                    }
                } catch (Exception unused2) {
                }
                return b0.j(clipDescription != null ? Optional.of(clipDescription) : Optional.empty());
        }
    }
}
