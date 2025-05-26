package u5;

import android.credentials.CreateCredentialException;
import android.credentials.CreateCredentialResponse;
import android.credentials.GetCredentialException;
import android.credentials.GetCredentialResponse;
import android.view.inputmethod.DeleteGesture;
import android.view.inputmethod.DeleteRangeGesture;
import android.view.inputmethod.InsertGesture;
import android.view.inputmethod.JoinOrSplitGesture;
import android.view.inputmethod.RemoveSpaceGesture;
import android.view.inputmethod.SelectGesture;
import android.view.inputmethod.SelectRangeGesture;

/* loaded from: classes3.dex */
public abstract /* synthetic */ class r {
    public static /* bridge */ /* synthetic */ Class A() {
        return DeleteGesture.class;
    }

    public static /* bridge */ /* synthetic */ Class B() {
        return JoinOrSplitGesture.class;
    }

    public static /* bridge */ /* synthetic */ Class C() {
        return InsertGesture.class;
    }

    public static /* bridge */ /* synthetic */ Class D() {
        return RemoveSpaceGesture.class;
    }

    public static /* bridge */ /* synthetic */ CreateCredentialException a(Object obj) {
        return (CreateCredentialException) obj;
    }

    public static /* bridge */ /* synthetic */ CreateCredentialResponse b(Object obj) {
        return (CreateCredentialResponse) obj;
    }

    public static /* bridge */ /* synthetic */ GetCredentialException e(Object obj) {
        return (GetCredentialException) obj;
    }

    public static /* bridge */ /* synthetic */ GetCredentialResponse g(Object obj) {
        return (GetCredentialResponse) obj;
    }

    public static /* bridge */ /* synthetic */ Class k() {
        return SelectGesture.class;
    }

    public static /* bridge */ /* synthetic */ Class u() {
        return SelectRangeGesture.class;
    }

    public static /* bridge */ /* synthetic */ Class x() {
        return DeleteRangeGesture.class;
    }
}
