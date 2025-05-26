package com.google.android.material.datepicker;

import com.google.android.material.datepicker.CalendarConstraints;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes3.dex */
public final class d implements f {
    @Override // com.google.android.material.datepicker.f
    public final boolean a(long j13, List list) {
        Iterator it = list.iterator();
        while (it.hasNext()) {
            CalendarConstraints.DateValidator dateValidator = (CalendarConstraints.DateValidator) it.next();
            if (dateValidator != null && !dateValidator.u0(j13)) {
                return false;
            }
        }
        return true;
    }

    @Override // com.google.android.material.datepicker.f
    public final int getId() {
        return 2;
    }
}
