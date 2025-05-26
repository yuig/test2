package r10;

import com.pinterest.api.model.r40;
import java.text.DateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.TimeZone;

/* loaded from: classes3.dex */
public final class a extends r40 {

    /* renamed from: c, reason: collision with root package name */
    public static final DateFormat f106021c;

    /* renamed from: b, reason: collision with root package name */
    public final List f106022b;

    static {
        DateFormat dateInstance = DateFormat.getDateInstance(1);
        f106021c = dateInstance;
        dateInstance.setTimeZone(TimeZone.getTimeZone("UTC"));
    }

    public a(String str, String str2, String str3, String str4, String str5, String str6, String str7, List<q10.a> list, Date date, String str8, String str9, String str10) {
        super(str, str2, str3, str4, str5, str6, str7);
        new ArrayList();
        this.f106022b = list;
        try {
            f106021c.format(date);
        } catch (Exception unused) {
        }
    }
}
