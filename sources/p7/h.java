package p7;

import android.net.Uri;
import android.text.TextUtils;
import androidx.media3.common.ParserException;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.nio.charset.StandardCharsets;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Locale;
import java.util.TimeZone;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import l8.y;

/* loaded from: classes3.dex */
public final class h implements y {

    /* renamed from: a, reason: collision with root package name */
    public static final Pattern f98981a = Pattern.compile("(.+?)(Z|((\\+|-|−)(\\d\\d)(:?(\\d\\d))?))");

    @Override // l8.y
    public final Object k(Uri uri, g7.g gVar) {
        String readLine = new BufferedReader(new InputStreamReader(gVar, StandardCharsets.UTF_8)).readLine();
        try {
            Matcher matcher = f98981a.matcher(readLine);
            if (!matcher.matches()) {
                throw ParserException.b("Couldn't parse timestamp: " + readLine, null);
            }
            String group = matcher.group(1);
            SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss", Locale.US);
            simpleDateFormat.setTimeZone(TimeZone.getTimeZone("UTC"));
            long time = simpleDateFormat.parse(group).getTime();
            if (!"Z".equals(matcher.group(2))) {
                long j13 = "+".equals(matcher.group(4)) ? 1L : -1L;
                long parseLong = Long.parseLong(matcher.group(5));
                String group2 = matcher.group(7);
                time -= (((parseLong * 60) + (TextUtils.isEmpty(group2) ? 0L : Long.parseLong(group2))) * 60000) * j13;
            }
            return Long.valueOf(time);
        } catch (ParseException e13) {
            throw ParserException.b(null, e13);
        }
    }
}
