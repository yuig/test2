package fh;

import android.os.Bundle;
import android.os.Parcel;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.pinterest.feature.core.view.RecyclerViewTypes;
import xg.m;

/* loaded from: classes3.dex */
public abstract class b extends ai.k {
    @Override // ai.k
    public boolean B(int i13, Parcel parcel, Parcel parcel2) {
        switch (i13) {
            case RecyclerViewTypes.VIEW_TYPE_PIN_CLOSEUP_HAIR_PATTERN_QUERIES_MODULE /* 101 */:
                ai.l.b(parcel);
                throw new UnsupportedOperationException();
            case RecyclerViewTypes.VIEW_TYPE_PIN_CLOSEUP_SHOPPING_MODULE /* 102 */:
                Status status = (Status) ai.l.a(parcel, Status.CREATOR);
                ai.l.b(parcel);
                f fVar = (f) this;
                switch (fVar.f62141b) {
                    case 0:
                        ((g) fVar.f62142c).C0(status);
                        break;
                    default:
                        throw new UnsupportedOperationException();
                }
            case RecyclerViewTypes.VIEW_TYPE_PIN_CLOSEUP_TEMPLATE_DETAILS_MODULE /* 103 */:
                Status status2 = (Status) ai.l.a(parcel, Status.CREATOR);
                ai.l.b(parcel);
                f fVar2 = (f) this;
                switch (fVar2.f62141b) {
                    case 1:
                        ((g) fVar2.f62142c).C0(status2);
                        break;
                    default:
                        throw new UnsupportedOperationException();
                }
            default:
                return false;
        }
        parcel2.writeNoException();
        return true;
    }

    @Override // ai.k
    public boolean j(int i13, Parcel parcel) {
        if (i13 != 1) {
            return false;
        }
        Bundle bundle = (Bundle) fi.a.a(parcel, Bundle.CREATOR);
        fi.a.b(parcel);
        m mVar = (m) this;
        fi.i iVar = mVar.f134932c.f134917d;
        TaskCompletionSource taskCompletionSource = mVar.f134931b;
        if (iVar != null) {
            iVar.c(taskCompletionSource);
        }
        taskCompletionSource.trySetResult(bundle);
        return true;
    }
}
