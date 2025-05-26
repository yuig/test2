package com.google.android.material.datepicker;

import android.content.Context;
import android.widget.BaseAdapter;
import android.widget.TextView;
import java.util.Calendar;
import java.util.Collection;
import java.util.Date;
import java.util.Iterator;
import java.util.Locale;

/* loaded from: classes3.dex */
public final class z extends BaseAdapter {

    /* renamed from: g, reason: collision with root package name */
    public static final int f32594g = i0.g(null).getMaximum(4);

    /* renamed from: h, reason: collision with root package name */
    public static final int f32595h = (i0.g(null).getMaximum(7) + i0.g(null).getMaximum(5)) - 1;

    /* renamed from: a, reason: collision with root package name */
    public final Month f32596a;

    /* renamed from: b, reason: collision with root package name */
    public final DateSelector f32597b;

    /* renamed from: c, reason: collision with root package name */
    public Collection f32598c;

    /* renamed from: d, reason: collision with root package name */
    public android.support.v4.media.a f32599d;

    /* renamed from: e, reason: collision with root package name */
    public final CalendarConstraints f32600e;

    /* renamed from: f, reason: collision with root package name */
    public final DayViewDecorator f32601f;

    public z(Month month, DateSelector dateSelector, CalendarConstraints calendarConstraints, DayViewDecorator dayViewDecorator) {
        this.f32596a = month;
        this.f32597b = dateSelector;
        this.f32600e = calendarConstraints;
        this.f32601f = dayViewDecorator;
        this.f32598c = dateSelector.T1();
    }

    public final int a() {
        int i13 = this.f32600e.f32475e;
        Month month = this.f32596a;
        Calendar calendar = month.f32486a;
        int i14 = calendar.get(7);
        if (i13 <= 0) {
            i13 = calendar.getFirstDayOfWeek();
        }
        int i15 = i14 - i13;
        return i15 < 0 ? i15 + month.f32489d : i15;
    }

    @Override // android.widget.Adapter
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public final Long getItem(int i13) {
        if (i13 < a() || i13 > c()) {
            return null;
        }
        int a13 = (i13 - a()) + 1;
        Calendar c13 = i0.c(this.f32596a.f32486a);
        c13.set(5, a13);
        return Long.valueOf(c13.getTimeInMillis());
    }

    public final int c() {
        return (a() + this.f32596a.f32490e) - 1;
    }

    public final void d(TextView textView, long j13, int i13) {
        boolean z13;
        boolean z14;
        a0.a aVar;
        if (textView == null) {
            return;
        }
        Context context = textView.getContext();
        boolean z15 = false;
        boolean z16 = i0.f().getTimeInMillis() == j13;
        DateSelector dateSelector = this.f32597b;
        Iterator it = dateSelector.h1().iterator();
        while (true) {
            if (!it.hasNext()) {
                z13 = false;
                break;
            }
            Object obj = ((p5.b) it.next()).f98855a;
            if (obj != null && ((Long) obj).longValue() == j13) {
                z13 = true;
                break;
            }
        }
        Iterator it2 = dateSelector.h1().iterator();
        while (true) {
            if (!it2.hasNext()) {
                z14 = false;
                break;
            }
            Object obj2 = ((p5.b) it2.next()).f98856b;
            if (obj2 != null && ((Long) obj2).longValue() == j13) {
                z14 = true;
                break;
            }
        }
        Calendar f13 = i0.f();
        Calendar g13 = i0.g(null);
        g13.setTimeInMillis(j13);
        String format = f13.get(1) == g13.get(1) ? i0.b("MMMMEEEEd", Locale.getDefault()).format(new Date(j13)) : i0.b("yMMMMEEEEd", Locale.getDefault()).format(new Date(j13));
        if (z16) {
            format = String.format(context.getString(fj.k.mtrl_picker_today_description), format);
        }
        if (z13) {
            format = String.format(context.getString(fj.k.mtrl_picker_start_date_description), format);
        } else if (z14) {
            format = String.format(context.getString(fj.k.mtrl_picker_end_date_description), format);
        }
        textView.setContentDescription(format);
        if (this.f32600e.f32473c.u0(j13)) {
            textView.setEnabled(true);
            Iterator it3 = dateSelector.T1().iterator();
            while (true) {
                if (!it3.hasNext()) {
                    break;
                }
                if (i0.a(j13) == i0.a(((Long) it3.next()).longValue())) {
                    z15 = true;
                    break;
                }
            }
            textView.setSelected(z15);
            aVar = z15 ? (a0.a) this.f32599d.f15838b : i0.f().getTimeInMillis() == j13 ? (a0.a) this.f32599d.f15839c : (a0.a) this.f32599d.f15837a;
        } else {
            textView.setEnabled(false);
            aVar = (a0.a) this.f32599d.f15843g;
        }
        if (this.f32601f == null || i13 == -1) {
            aVar.c(textView);
            return;
        }
        int i14 = this.f32596a.f32488c;
        aVar.c(textView);
        textView.setCompoundDrawables(null, null, null, null);
        textView.setContentDescription(format);
    }

    public final void e(MaterialCalendarGridView materialCalendarGridView, long j13) {
        Month d2 = Month.d(j13);
        Month month = this.f32596a;
        if (d2.equals(month)) {
            Calendar c13 = i0.c(month.f32486a);
            c13.setTimeInMillis(j13);
            int i13 = c13.get(5);
            d((TextView) materialCalendarGridView.getChildAt((materialCalendarGridView.a().a() + (i13 - 1)) - materialCalendarGridView.getFirstVisiblePosition()), j13, i13);
        }
    }

    @Override // android.widget.Adapter
    public final int getCount() {
        return f32595h;
    }

    @Override // android.widget.Adapter
    public final long getItemId(int i13) {
        return i13 / this.f32596a.f32489d;
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x006c  */
    @Override // android.widget.Adapter
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final android.view.View getView(int r6, android.view.View r7, android.view.ViewGroup r8) {
        /*
            r5 = this;
            android.content.Context r0 = r8.getContext()
            android.support.v4.media.a r1 = r5.f32599d
            if (r1 != 0) goto Lf
            android.support.v4.media.a r1 = new android.support.v4.media.a
            r1.<init>(r0)
            r5.f32599d = r1
        Lf:
            r0 = r7
            android.widget.TextView r0 = (android.widget.TextView) r0
            r1 = 0
            if (r7 != 0) goto L26
            android.content.Context r7 = r8.getContext()
            android.view.LayoutInflater r7 = android.view.LayoutInflater.from(r7)
            int r0 = fj.i.mtrl_calendar_day
            android.view.View r7 = r7.inflate(r0, r8, r1)
            r0 = r7
            android.widget.TextView r0 = (android.widget.TextView) r0
        L26:
            int r7 = r5.a()
            int r7 = r6 - r7
            if (r7 < 0) goto L5c
            com.google.android.material.datepicker.Month r8 = r5.f32596a
            int r2 = r8.f32490e
            if (r7 < r2) goto L35
            goto L5c
        L35:
            r2 = 1
            int r7 = r7 + r2
            r0.setTag(r8)
            android.content.res.Resources r8 = r0.getResources()
            android.content.res.Configuration r8 = r8.getConfiguration()
            java.util.Locale r8 = r8.locale
            java.lang.Integer r3 = java.lang.Integer.valueOf(r7)
            java.lang.Object[] r3 = new java.lang.Object[]{r3}
            java.lang.String r4 = "%d"
            java.lang.String r8 = java.lang.String.format(r8, r4, r3)
            r0.setText(r8)
            r0.setVisibility(r1)
            r0.setEnabled(r2)
            goto L65
        L5c:
            r7 = 8
            r0.setVisibility(r7)
            r0.setEnabled(r1)
            r7 = -1
        L65:
            java.lang.Long r6 = r5.getItem(r6)
            if (r6 != 0) goto L6c
            goto L73
        L6c:
            long r1 = r6.longValue()
            r5.d(r0, r1, r7)
        L73:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.datepicker.z.getView(int, android.view.View, android.view.ViewGroup):android.view.View");
    }

    @Override // android.widget.BaseAdapter, android.widget.Adapter
    public final boolean hasStableIds() {
        return true;
    }
}
