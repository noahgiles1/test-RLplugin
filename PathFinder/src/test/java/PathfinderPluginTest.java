import com.noah.pathfinder.PathHighlightPlugin;
import net.runelite.client.RuneLite;
import net.runelite.client.externalplugins.ExternalPluginManager;

public class PathfinderPluginTest
{
	public static void main(String[] args) throws Exception
	{
		ExternalPluginManager.loadBuiltin(PathHighlightPlugin.class);
		RuneLite.main(args);
	}
}