# jEdit Central
Fork of jEdit program editor that includes builds, plugins, resources, etc.

# Objective

jEdit is a fantastic program editor that -- to this day -- is competitive with more modern editors such as VS Code, sublime, etc. Unfortunately, many engineers think jEdit is only for Java. Far from it! In fact, I rarely code in Java anymore, but I use jEdit daily for developing in Python, Solidity, Bash, Swift, React Native, PHP, Javascript, etc.

Finding update-to-date resources is becoming more difficult (including new versions of plugins that aren't pushed to the repos) as other editors gain popularity. In this fork, I'll attempt to try and collect today many of modes, plugins, resources, and builds so people who want to use/modify/contribute to jEdit can do so easily. So please fork and add pull requests! We'll merge everything together.

Also, if you use jEdit, please donate at the main website [jEdit Home Page](http://www.jedit.org/) so they keep it running. Since I use jEdit every day, I donate every year to keep jEdit supported. If you use it, please donate too! [jEdit Donations](http://sourceforge.net/project/project_donations.php?group_id=588)

# Reasons Why jEdit Remains My Editor of Choice

If you've stumbled across this repo and aren't already a jEdit user, here are a few places where jEdit excels and other editors can be bit clunky or difficult to use.

# Multi-platform

I daily switch between MacOS, Windows, and Ubuntu Desktop. It's amazing to run exactly the same editor with the same features on every platform. When I've tried to switch editors in the past, I've always run into the problems of the editor not being unavailable or a plugin that doesn't work consistently across platforms. With jEdit, everything is there for you.

## Multi-server editing

I very often have to edit files across servers or on various remote servers. To provide some concrete examples, on a single day I might edit:

* Edit a local Python .py file
* Diff the same file on several DIFFERENT servers with color coded diff highlights
* Edit a remote nginx config
* Edit a remote Solidity file on the Ethereum server
* Evaluate a JSON file for errors
* Add a configuration to a router XML file
* Create a bash script for a cron job
* Add entries to a /etc/hosts file
* Remove whitespace and format an HTML static file
* Edit a bash file on Raspberry Pi
* Edit the JSX in a React component

With jEdit's SFTP plugin, I can easily reach right into any server that I'm responsible for rich editing without copying my vimrc to a bunch of servers, install editor features, etc.

Although most modern editors have some remote SFTP capability, all the ones I've used have clunky JSON config files where you have to add/test/edit individual settings for each server and then cumbersomely maintain that config. With jEdit, you can just use a file browser like you're accessing local files and then bookmark/favorite any remote file or directory. Simple, painless.

## Macro recording

Ever need to do the same editing process over and over again? jEdit includes a macro recorder that allows you to Start Recording, do a bunch of operations including search/replace, regex matching, etc. and then simply save that as a macro to run again and again. It records the macro as a BeanShell script, so if you know even a little Java, you can easily modify the script to add conditions, loops, etc.


## Regex search/replace of remote directories

Before jEdit, I would often have to:

* SSH to a server
* Add my vim shortcuts and configs
* Find the directory I needed
* Figure out the sed regex I needed by running it over and over
* Backing up the files I needed in case the I made a mistake and my sed match messed up the files
* Ran a test piped into less to see where all the matches were
* If a match looked wrong, quit less, edit/examine the file or regex
* Repeat until right
* Run the change

Pretty tedious. With jEdit, I can:

* Select the remote directory on the remote server from my Favorites menu
* Use the GUI to refine my regex and SEE the context for all of the matches across all of the files
* Run the change and have all of the matching files change and open WITHOUT saving (if I want) so I can examine the modifications
* Save or discard any changes I want

Of course, this remote search is slower than if I'm grepping on the server directly, but the convenience and power of this method saves me an unbelievable amount of time each week.

## Powerful Regex Replacement

The Find/Replace tool will do full regex matching and load the files showing the changes before saving. How many times have you used `sed` and messed up something with an unexpected match? With jEdit, you can see/evaluate the changes before you save.

# Plugins

I'm including builds of plugins here in case the plugin download mirrors go offline. Use the Plugin Manager if possible, but if you can't find a build of a plugin that adds a feature or fixes a bug that is mentioned in the jedit-devel@lists.sourceforge.net, you can check here.

To add a plugin, in most cases you can just copy it to your /jars folder and reboot jEdit.


# Resources

* Modes -- Adds syntax highlighting for various languages
** kaoscript -- https://github.com/kaoscript/highlight-jedit


# Changelog

* Added kaoscript mode to modes catalog & folder -- https://github.com/kaoscript/highlight-jedit
* Added builds of some plugins
* Added prototype Solidity mode
